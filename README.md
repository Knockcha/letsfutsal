# Let's Futsal ⚽

> 풋살 동호회·매칭 플랫폼 — **팀 등록 / 경기장(Stadium) / 매치 / 자유게시판 + 회원 시스템**.
> Spring Legacy(MVC) + MyBatis + JSP 기반 팀 프로젝트.

Forked from [`WizWix/letsfutsal`](https://github.com/WizWix/letsfutsal)
작업 기간: **2025-12-22 ~ 2025-12-29 (약 1주)** · 팀: WizWix(팀장) 외 다수 · **Knockcha(본인) — 회원/인증 라인 단독 담당**

---

## ✨ Features

- ⚽ **팀 / 경기장 / 매치** — 팀 등록, 경기장 등록, 매치 생성·참가
- 📝 **자유게시판** — 게시글 / 댓글 / 카테고리
- 🔐 **회원 시스템** — 가입 / 로그인 / 세션 가드 (Interceptor 기반)

---

## 🛠 Tech Stack

| Layer | Stack |
| --- | --- |
| Backend | Java · **Spring MVC (Legacy)** · **MyBatis** · Maven (`pom.xml`) |
| View | **JSP** + `WEB-INF/views` |
| DB | MySQL · MyBatis XML mapper (`mapper_user.xml`, `mapper_team.xml`, `mapper_match.xml`, `mapper_stadium.xml`, `mapper_board.xml`, `mapper_entity.xml`) |
| 설정 | **Spring Java Config** — `AppInitializer` / `RootConfig` / `WebConfig` |
| DTO 도메인 | User · Team · Stadium · Match · Article · Comment · Category · Entity |
| Interceptor | `LoginInterceptor` (세션 가드) |

---

## 🙋 My Contributions (by [@Knockcha](https://github.com/Knockcha))

> **회원 / 인증 / 세션 라인을 단독으로 담당**했고, 팀의 Spring MVC 기반 설정도 직접 작성했습니다.

### 작업 내역

| Commit | 내용 |
| --- | --- |
| `be82415` | feat: 회원 관리 시스템 + Spring MVC 설정 추가 |
| `9cb0319` | chore: Sync fork with upstream/main |
| `f56f35d` | refactor: 팀장 피드백 반영 — 아키텍처 개선 |
| `da87840` | PR #4 머지 — 회원 관리 시스템 + Spring MVC 설정 |

### 담당 영역

- `user/` 패키지 — `IUserService`, `UserService`, `UserController`
- `mapper/UserMapper.java` + `mapper_user.xml` (MyBatis 연동)
- `LoginInterceptor.java` — 세션 가드 인터셉터
- `config/` — Spring Java Config 3종 (`AppInitializer` / `RootConfig` / `WebConfig`)
- SQL 스키마 — `sql/letsfutsal_init.sql`, `sql/create_user.sql`

### 어필 포인트

- ✅ **Spring Legacy + MyBatis** 경험 — Spring Boot 대비 **설정 깊이를 직접 다뤄봄** (XML 없이 Java Config로 작성)
- ✅ **인증 풀라인 단독 구현** — 회원·세션·Interceptor까지 직접 설계
- ✅ **코드 리뷰 문화 경험** — 팀장 피드백을 반영한 refactor commit (`f56f35d`)으로 아키텍처 개선

---

## 🚀 Run

```bash
mvn clean install
# Tomcat에 WAR 배포 또는 IDE에서 Run on Server
# DB는 sql/letsfutsal_init.sql + sql/create_user.sql 로 초기화
```
