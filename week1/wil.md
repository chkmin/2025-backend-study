## <백엔드 스터디 1주차 WIL>

### 이번주 스터디 목표
1주차인 만큼 너무 깊게 생각하려 하지 말고 전체적으로 정확히 어떤걸 배우는지 천천히 탐색해보자!!

### 오늘의 키워드
웹, http, API, REST API, Spring Boot

**1. 웹**
- 클라이언트가 서버에 요청을 보내면 서버가 처리하고 응답을 보내어 서로 통신하며 동작함
- URL: 위치를 나타내는 주소, Scheme(데이터를 주고 받는 방식, 규칙)//host(서버의 IP 주소 or 도메인)/Path(원하는 리소스 경로)?Query(추가적인 정보)
- HTTP 요청: start line(요청 메서드), headers(부가 정보), body(전송할 데이터)
- HTTP 응답: status line(http 상태코드), headers, body

**2. API, REST API**
- 데이터를 사용할 수 있도록 미리 정해놓은 규칙
- REST: 자원(URI), 행위(Method), 표현(Json)

**3.Spring Boot**
- spring: Java 언어의 객체 지향을 살려 프로그램을 개발할 수 있도록 도와주는 틀
- spring boot: 스프링 프레임워크를 빠르고 쉽게 사용할 수 있게 해주는 도구

**Whitelabel Error Page 스크린샷**

<img width="944" height="424" alt="스크린샷 2025-09-26 020700" src="https://github.com/user-attachments/assets/202e825b-1766-4a40-9e61-3bdbc38f0ad7" />
**온라인 쇼핑몰 명세서(상품, 주문)**

상품기능
1. 상품 목록 조회
   HTTP Method: GET
   URI: /products
2. 상품 상세 조회
   HTTP Method: GET
   URI: /products/{productID}
3. 상품 등록
   HTTP Method: POST
   URI: /products
4. 상품 수정
   HTTP Method: PATCH
   URI: /products/{productID}
5. 상품 삭제
   HTTP Method: DELETE
   URI: /products/{productID}

주문 기능
1. 주문 생성
   HTTP Method: POST
   URI: /orders
2. 주문 수정
   HTTP Method: PATCH
   URI: /orders/{orderID}
3. 주문 취소
   HTTP Method: DELETE
   URI: /orders/{orderID}/cancel
4. 주문 상세 조회
   HTTP Method: GET
   URI: /orders/{orderID}

### 느낀점
프론트엔드와 백엔드의 차이를 배우면서 두 영역이 맡는 역할이 확실히 다르다는 점이 흥미로웠고 프론트엔드는 사용자가 직접 마주하는 화면과 인터페이스를 구성하고, 백엔드는 보이지 않는 서버에서 데이터를 처리하며 필요한 정보를 제공하는 역할을 한다는 것을 알게 되었다. 결국 이 두부분이 빠짐없이 있어야지 하나의 서비스가 완성된다는 점이 인상깊었다.

또한 웹의 URL 구조와 HTTP 상태 코드에 대해서도 알게 되었는데, 특히 404 Not Found처럼 흔히 보던 오류의 의미를 정확히 이해할 수 있어서 뭔가 뿌듯한 기분이 들었다. 이 메시지들이 단순히 오류 메시지가 아니라 서버와 클라이언트 간의 의사소통 방식이라는 점이 인상 깊었다.

마지막으로, 화면 전체를 다시 불러오는 것이 아니라 뼈대는 그대로 두고 필요한 데이터만 서버에서 받아와 갱신하는 방식이 있다는 것을 알게 되었다. 이는 사용자의 환경을 쾌적하게 개선하고 속도 면에서도 효율적이라는 점에서 두마리의 토끼를 둘다 잡은 느낌이 들었다. 
### 다음 스터디 목표
다음 스터디는 시작한지는 얼마되지 않았지만 추석 및 중간고사 전 마지막 스터디인 만큼 이번 스터디보다 더욱 열심히 할 것이고 지식적인 부분에서 한층 더 성장할 것이다.
