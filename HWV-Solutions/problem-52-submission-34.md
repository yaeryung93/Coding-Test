# 짝수 판별하기

- 난이도: 보통
- 핵심 문법: 조건문
- 테스트 결과: 3/3 통과

## 문제 설명

정수 n이 주어질 때, 조건문을 사용하여 n이 짝수이면 1, 홀수이면 0을 반환하는 함수를 작성하세요.

## 제출 코드

~~~java
public class Solution { 
    public int solution(int n) { 
        if(n%2==0)
            return 1;
        return 0; 
    } 
}
~~~
