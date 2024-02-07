package GDSCKNU.CitySavior.controller;

import GDSCKNU.CitySavior.annotation.HasFile;
import GDSCKNU.CitySavior.common.resolver.annotation.UserInfo;
import GDSCKNU.CitySavior.dto.request.CreateReportCommentRequestDto;
import GDSCKNU.CitySavior.dto.request.ReportRequestDto;
import GDSCKNU.CitySavior.dto.response.MapReportsResponseDto;
import GDSCKNU.CitySavior.dto.response.ReportDetailResponseDto;
import GDSCKNU.CitySavior.dto.response.StatisticsResponseDto;
import GDSCKNU.CitySavior.entity.memberDetail.MemberDetailsImpl;
import GDSCKNU.CitySavior.service.AIService;
import GDSCKNU.CitySavior.service.ReportService;
import GDSCKNU.CitySavior.service.StorageService;
import GDSCKNU.CitySavior.service.achieveMember.AchievementMemberService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
@Slf4j
public class ReportsController {

    private final StorageService storageService;
    private final AIService aiService;
    private final ReportService reportService;
    private final AchievementMemberService achievementMemberService;

    @GetMapping("/reports/{report_id}")
    public ReportDetailResponseDto reportDetail(@PathVariable("report_id") Long reportId) {
        return reportService.getReportDetail(reportId);
    }

    @GetMapping("/reports")
    public Map<String, List<MapReportsResponseDto>> getReportsByGIS(@RequestParam(name = "latitude") double latitude,
                                                                    @RequestParam(name = "longitude") double longitude) {
        return reportService.getReportsByGIS(latitude, longitude);
    }

    @GetMapping("/reports/statistics")
    public StatisticsResponseDto getStatistics(@RequestParam("latitude") double latitude,
                                               @RequestParam("longitude") double longitude) {
        return reportService.getStatistics(latitude, longitude);
    }

    @PostMapping("/reports")
    public Long report(@RequestPart(name = "imgFiles") @HasFile MultipartFile imgFiles,
                       @UserInfo MemberDetailsImpl memberDetails,
                       @RequestPart(name = "requestDto") @Valid ReportRequestDto requestDto) {

        String fileName = storageService.saveFile(imgFiles);
        int damageRate = aiService.evaluateDamageRate(imgFiles);
        achievementMemberService.updateAchievementRecord(requestDto.category(), memberDetails);
        return reportService.saveReport(requestDto, damageRate, fileName);
    }

    @PostMapping("/reports/{report_id}/comment")
    public Long comment(@PathVariable("report_id") Long reportId,
                        @RequestBody CreateReportCommentRequestDto comment) {
        return reportService.addComment(reportId, comment.comment());
    }

    @PatchMapping("/reports/{reportId}/end")
    public void endReport(@PathVariable("reportId") Long reportId) {
        reportService.endReport(reportId);
    }
}
