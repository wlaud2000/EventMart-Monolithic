# EventMart-Monolithic : 이벤트 기반 아키텍처 실습 프로젝트

## 목차
[프로젝트 개요](#프로젝트-개요) \
[학습 목표](#학습-목표) \
[기술 스택](#기술-스택) \
[ERD](#erd)

### 프로젝트 개요

EventMart는 이벤트 드리븐 아키텍처(EDA)의 원리와 패턴을 실제로 구현해볼 수 있는 온라인 쇼핑몰 시스템입니다. \
이 프로젝트를 통해 주문, 재고, 배송 도메인 간의 느슨한 결합을 구현하고, 이벤트를 통한 비동기 통신 방식의 장점을 경험할 수 있습니다.

---

### 학습 목표

- 이벤트 기반 통신의 실제 구현
- CQRS 패턴과 이벤트 소싱의 실용적 적용
- 확장 가능하고 회복력 있는 시스템 구축 역량 강화

---

### 기술 스택
- Java 17
- Spring Boot 3.4.3
- Spring Data JPA
- Spring Kafka
- Kafka/Zookeeper
- Schema Registry
- MongoDB 
- MySQL 
- Docker & Docker Compose
- OpenTelemetry, Zipkin, Prometheus, Grafana

---

### ERD
https://www.erdcloud.com/d/7aDy9uLeEXDWmYZif
<img width="1856" alt="image" src="https://github.com/user-attachments/assets/bdb2bd9d-ce4f-405d-affe-f234143c2074" />


---

### 📋 Commit Message Convention
|   Gitmoji   |    Tag     | Description |
|:-----------:|:----------:| --- |
|      ✨      |   `feat`   | 새로운 기능 추가 |
|     🐛      |   `fix`    | 버그 수정 |
|     📝      |   `docs`   | 문서 추가, 수정, 삭제 |
|      ✅      |   `test`   | 테스트 코드 추가, 수정, 삭제 |
|     💄      |  `style`   | 코드 형식 변경 |
|     ♻️      | `refactor` | 코드 리팩토링 |
|     ⚡️      |   `perf`   | 성능 개선 |
|     💚      |    `ci`    | CI 관련 설정 수정 |
|     🚀      |  `chore`   | 기타 변경사항 |
|      🔥️      |  `remove`   | 코드 및 파일 제거 |
