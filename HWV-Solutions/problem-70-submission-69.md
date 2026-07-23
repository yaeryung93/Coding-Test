# Array Element Summation

- 난이도: 보통
- 핵심 문법: 배열
- 테스트 결과: 3/3 통과

## 문제 설명

Given an array of integers, calculate the sum of all elements that are greater than 10. Return the final sum as an integer.

## 제출 코드

~~~java
public class Solution {
    public int solution(int[] numbers) {
        // TODO
        int sum = 0;
        for(int num : numbers) {
            if(num >= 10) sum += num;
        }
        
        return sum;
    }
}
~~~
