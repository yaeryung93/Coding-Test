class Solution {
    public int[] solution(int n) {
        int len=0;
        for(int i=1; i<=n; i++){
            int anum=0;
            for(int j=1; j<i; j++){
                if(i%j==0 && j!=1){
                    anum++;
                }
            }
            if( n%i==0 && anum==0 && i!=1){
                len++;
            }
        }
        
        int[] answer = new int[len];
        int b=0;
        for(int i=1; i<=n; i++){
            int anum=0;
            for(int j=1; j<i; j++){
                if(i%j==0 && j!=1){
                    anum++;
                }
            }
            if( n%i==0 && anum==0 && i!=1){
                answer[b]+=i;
                b++;
            }
        }
        return answer;
    }
}