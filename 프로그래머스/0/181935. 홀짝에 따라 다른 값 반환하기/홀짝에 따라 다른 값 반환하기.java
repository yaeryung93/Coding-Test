class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum=0;
        if(n%2==1){
            for(int i=1; i<=n; i++){
                if(i%2==1){
                    sum+=i;
                }
            }
            answer+=sum;
            sum=0;

        }
        
        else{
            for(int i=1; i<=n; i++){
                if(i%2==0){
                    sum+=i*i;
                }
            answer+=sum;
            sum=0;
            }
        }
        return answer;
    }
}