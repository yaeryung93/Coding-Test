class Solution {
    public int[] solution(int n) {
        int len=1;
        int num=n;
        
        while(num!=1){
            if(num%2==0) {
                num/=2;
                len++;
            }
            else {
                num=(num*3)+1;
                len++;
            }
        }
        
        int[] answer = new int[len];
        answer[0]=n;
        int idx=1;
        
        while(n!=1){
            if(n%2==0) {
                n/=2;
            }
            else {
                n=(n*3)+1;
            }
            answer[idx++]=n;
        }
        return answer;
    }
}