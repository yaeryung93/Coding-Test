class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n<=7){
            answer=1;
        }
        else if(n<=14){
            answer=2;
        }
        else if(n<=21){
            answer=3;
        }
        else if(n<=28){
            answer=4;
        }
        else if(n<=35){
            answer=5;
        }
        else if(n<=42){
            answer=6;
        }
        else if(n<=49){
            answer=7;
        }
        else if(n<=56){
            answer=8;
        }
        else if(n<=63){
            answer=9;
        }
        else if(n<=70){
            answer=10;
        }
        else if(n<=77){
            answer=11;
        }
        else if(n<=84){
            answer=12;
        }
        else if(n<=91){
            answer=13;
        }
        else if(n<=98){
            answer=14;
        }
        else{
            answer=15;
        }
        return answer;
    }
}