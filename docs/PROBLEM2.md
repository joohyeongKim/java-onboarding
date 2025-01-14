
## 구현 기능 목록

- 저장 기능
  - 연속으로 이어지는 문자가 중복이 아닐 경우에만 추출
  - 추출한 문자가 순서대로 저장된 리스트를 반환
- 반환 기능
  - 저장된 리스트를 넘겨받고 문자열로 형변환하여 반환

---

>암호해독 규칙 발견
>1. 탐색하면서 만나게 되는 첫번째 중복문자들만 제거한다.
>2. 나머지 문자열은 다음 순서로 넘어가 순회한다.
   (애초에 Set으로 한 번에 중복 문자를 제거하면 원하는 결과가 안나오는 것이었다!)

- 중복 검사
  - 연속으로 같은 문자를 만나는지 검사한다.
- 저장 기능
  - 입력받은 문자 저장을 순회한다.
- 삭제 기능
  - 중복문자를 발견하면 삭제한다
- 반환 기능
  - 중복이 제거된 결과를 반환한다.


---

### 제거된 기능

- ~~삭제기능~~
  - 중복일 경우 실행을 건너뛰는 것으로 대체
- ~~변환하기~~
- ~~순서보장~~
  - 피곤해서 알파벱 순서가 헷갈리고 순서 보장이 필요한 걸로 착각..
- ~~소문자구하기~~ && ~~길이제한~~
  - 소문자, 문자열 길이 제한(1~1000)은 구할 필요 없이 주어진 사항이므로 삭제
  

## 🚀 기능 요구 사항

암호문을 좋아하는 괴짜 개발자 브라운이 이번에는 중복 문자를 이용한 새로운 암호를 만들었다. 예를 들어 "browoanoommnaon"이라는 암호문은 다음과 같은 순서로 해독할 수 있다.

1. "browoanoommnaon"
2. "browoannaon"
3. "browoaaon"
4. "browoon"
5. "brown"

임의의 문자열 cryptogram이 매개변수로 주어질 때, 연속하는 중복 문자들을 삭제한 결과를 return 하도록 solution 메서드를 완성하라.

### 제한사항

- cryptogram은 길이가 1 이상 1000 이하인 문자열이다.
- cryptogram은 알파벳 소문자로만 이루어져 있다.

### 실행 결과 예시

| cryptogram | result |
| --- | --- |
| "browoanoommnaon" | "brown" |
| "zyelleyz" | "" |

---

## 문제 분석 재시도

암호 해독 순서
1. "browoanoommnaon"
2. "browoannaon"
3. "browoaaon"
4. "browoon"
5. "brown"






