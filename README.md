# PG MSA

그런데, Hexagonal 을 곁들인

## 디렉토리 구조 설명
각 모듈마다 build.gradle 생성

```markdown
├──Module
|  ├──adapter
|  |  ├──in.web
|  |  ├──out.persistence
|  ├──application
|  |  ├──port
|  |  |  ├──in
|  |  |  ├──out
|  |  ├──service
|  ├──domain
├──build.gradle
```
### Adapter
외부 시스템과의 상호작용
### Application
실제 비즈니스 로직
#### Port (interface)
Port 는 비즈니스 로직(application)과 직접 통신하는 Interface
#### Service
실제 비즈니스 로직의 구현체
### Domain
일반적인 모델정보를 저장하는 패키지

## 모듈들
[Mebership](./membership-service/README.md)

---

**삽질기록**
- build.gradle 설정하다가 하루 다 보낼뻔
  - [ ] gradle vs maven (vs groovy) 차이 알아보자
  - [ ] kotlin + spring 되나 ? 찾아보자
