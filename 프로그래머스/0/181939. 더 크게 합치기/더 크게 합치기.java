class Solution {
    public int solution(int a, int b) {
        int num1=a;
        int num2=b;
        
        int i=10;
        while(num2>=10){
            num2/=10;
            i*=10;
        }
        int sum1=a*i+b;
        
        i=10;
        while(num1>=10){
            num1/=10;
            i*=10;
        }
        int sum2=b*i+a;
        
        if(sum1>=sum2) return sum1;
        else return sum2;
    }
}