class Solution {
    public int solution(int[] numbers, int k) {
        int idx=0;
        for(int i=1; i<k; i++){
            if(idx+2<numbers.length) idx+=2;
            else if(idx+2==numbers.length) idx=0;
            else idx=(idx+2)%numbers.length;
        }
        return numbers[idx];
    }
}