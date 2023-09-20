# Membership Service

## 정의
MSA-Pay 라는 비즈니스에서 제공하는 멤버십 서비스  
가입하는 개인/법인 고객의 정보를 **소유(Own)** 하고 관련 **정보 변경에 대한 의무**를 가진 서비스  

## MVP Version

Pay 에 가입하는 개인/법인 고객의 정보를 소유하고, 새로운 멤버십의 추가가 가능하며, 이에 대한 정보를 조회할 수 있는 기능을 제공하는 서비스

### API 설계

#### Query
- 고객정보
  - find membership by membership id

#### Command
- 필요한 고객정보를 통한 신규 고객 멤버십의 생성
  - register membership
