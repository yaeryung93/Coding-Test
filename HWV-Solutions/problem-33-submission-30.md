# for문을 이용한 1부터 N까지의 합

- 난이도: 쉬움
- 핵심 문법: for문
- 테스트 결과: 3/3 통과

## 문제 설명

자연수 n이 매개변수로 주어질 때, for문을 사용하여 1부터 n까지의 모든 자연수의 합을 구하여 반환하는 메서드를 작성하세요.

## 제출 코드

~~~java
public class Main {
    public static int solution(String input) {
        int sum=0;
        for(int i=1; i<=Integer.parseInt(input); i++)
            sum+=i;
        return sum;
    }

    public static void main(String[] args) throws Exception {
        String input = new String(System.in.readAllBytes()).trim();
        System.out.print(solution(input));
    }
}

~~~
