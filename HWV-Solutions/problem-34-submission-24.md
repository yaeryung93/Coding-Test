# 조건문을 활용한 홀짝 판별

- 난이도: 쉬움
- 핵심 문법: 조건문
- 테스트 결과: 3/3 통과

## 문제 설명

정수 num이 주어질 때, if 조건문을 사용하여 num이 짝수이면 "Even"을, 홀수이면 "Odd"를 반환하는 메서드를 작성하세요.

## 제출 코드

~~~java
public class Main {
    public static String solution(String input) {
        if(Integer.parseInt(input)%2==0)
            return "Even";
        return "Odd";
    }

    public static void main(String[] args) throws Exception {
        String input = new String(System.in.readAllBytes()).trim();
        System.out.print(solution(input));
    }
}

~~~
