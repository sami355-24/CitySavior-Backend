<div align="center">

**⚠️ 원본 [레포지토리](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend)와 달리 본 레포지토리는 제가 구현한 것 위주로 수정한 것입니다.**

![Group_2111](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/60bc0c48-7e2a-484f-9f24-880148df77ab)
</div>

<div align="center">

<br>

# CitySavior

</div>

<div align="center">

### CitySavior는 사용자가 지도를 통해 도심속 발생하는 여러 문제들을 보고하고 관리할 수 있도록 하며, AI를 사용하여 피해를 평가하고 도시의 지속 가능성에 기여합니다.

</div>


1️⃣ [Introduction](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#-introduction)

2️⃣ [Feature](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#-features)

3️⃣ [Wireframe](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#%EF%B8%8F-wireframe)

4️⃣ [ERD](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#%EF%B8%8F-erd)

5️⃣ [Technologies](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#%EF%B8%8F-technologies)

6️⃣ [Images](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#-images)

6️⃣ [Video](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#-video) 

7️⃣ [Repository](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#-repository)

8️⃣ [Contributors](https://github.com/sami355-24/CitySavior-Backend?tab=readme-ov-file#-contributors)

---

# 👋 Introduction

> CitySavior는 사용자에게 지도를 통해 도심속 불편한 점을 신고할 수 있는 플랫폼을 제공합니다.
> CitySavior의 관리자는 이 신고된 문제를 관리하고 완료된 것으로 표시할 수 있으며
> AI를 활용하여 신고된 문제의 파손 정도를 평가합니다. 신고 글은 특정 위치 기반으로 조회할 수 있습니다. 
> 사용자는 자신이 신고한 문제들을 확인할 수 있으며 CitySavior를 통해 [UN 지속가능발전목표](https://www.undp.org/ko/policy-centre/seoul/sustainable-development-goals)중
> **Industry, Innovation, and Infrastructure**와 **Sustainable Cities and Communities**에 기여할 수 있습니다.

---

# 📱 Features
**⚠️ 원본 [레포지토리](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend)와 달리 본 레포지토리는 제가 구현한 것 위주로 수정한 것입니다.**

## 신고
- 사용자는 자신이 생성한 신고에 대해서 추가, 수정이 가능하다.
- 사용자는 다른 사람이 신고한 내역을 확인할 수 있다.
- 신고는 사진, 위치, 카테고리, 손상도, 특이사항, 신고 일자로 구성된다
- 신고하며 올라온 사진은 Gcp의 Cloud Storage에 저장된다.
- 신고는 상세 조회가 가능하다.
- 사용자는 신고를 위치기반으로 조회할 수 있다.
- 사용자는 신고글에 대한 댓글을 남길 수 있다.

## 관리자
- 올라온 신고글을 `[완료]` 와 같은 형식으로 수정할 수 있다.

## 예외처리
- 신고, AI 통신 관련 예외 발생시 예외처리를 통해 사용자에게 적절한 메시지를 전달한다.

### Detail
![image](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/571f54c8-bbf7-4ba8-993f-16828cb501c2)

---

# ⛓️ Wireframe
![image](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/cf2621e4-2c74-4a89-89b2-91920532860d)

---

# 🛠️ ERD
![image](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/4af78ac6-19dc-4198-9deb-e9c97ff6f975)

---

# ⚙️ Technologies
- Spring Boot
- JDK 17
- JPA
- PostgreSQL(+postgis)
- Redis 7.2.4
- intelliJ IDEA
- GCP
- Google Cloud Storage
- Google Cloud Sql

---

# 📷 Images
|       **OnBoarding Page**               |                                                          **Home Page**                                                           |  **Map Page**   |
|:----------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------:|:---------------:|
|![1_onboarding](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/330c861a-ca18-48e1-90c3-8dae98bfc482)|    ![2_home](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/6df71f62-f30a-4ffb-ba31-60492e44c9f5)     |       ![3_map](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/b73d1285-c212-455f-a875-deb09a8c9a11)           |
|         **Create Repory Page**      |                                                      **Report Deail Page**                                                       | **Profil Page** |
|![5_create_report](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/d5c6bc34-5bc3-4d2e-b733-af911778fdf9)|![6_report_detail](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/17aae4fd-25d4-4235-9bdd-e4e333ce09db)|![7_profile](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend/assets/72246411/4eea95af-4fca-4992-8aea-332a4dc1b27d)

---

# 🎥 Video
GDSC KNU 3rd Solution Challenge CitySavior 프로젝트 소개 영상입니다.<br>
[![CitySavior](https://img.youtube.com/vi/BD8iqF3XfLc/0.jpg)](https://www.youtube.com/watch?v=BD8iqF3XfLc)

---

# 📁 Repository
[📱 Android Repository](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Android)
<br>
[🌐 Backend Repository](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-Backend)
<br>
[🤖 AI Repository](https://github.com/GDSC-KNU/3rd-sc-ex1-CitySavior-AI)

---

# 🤝 Contributors
[<img src="https://github.com/bayy1216.png" width="100px">](https://github.com/bayy1216)
[<img src="https://github.com/jinchiim.png" width="100px">](https://github.com/jinchiim)
[<img src="https://github.com/sami355-24.png" width="100px">](https://github.com/sami355-24)
[<img src="https://github.com/Bosung-Baek" width="100px">](https://github.com/Bosung-Baek)
