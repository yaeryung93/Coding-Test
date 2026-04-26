class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int a=numer1*denom2+numer2*denom1;
        int b=denom1*denom2;
        
        int x=a;
        int y=b;
        
        while(y!=0){
            int rf=x%y;
            x=y;
            y=rf;
        }
        answer[0]=a/x;
        answer[1]=b/x;
        
        return answer;
    }
}