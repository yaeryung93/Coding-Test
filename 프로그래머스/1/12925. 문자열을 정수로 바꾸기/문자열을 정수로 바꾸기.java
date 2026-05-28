class Solution {
    public int solution(String s) {
        int answer = 0;
        int len=s.length();
        boolean ne=s.charAt(0)=='-';
        boolean po=s.charAt(0)=='+';
        int start=ne ? 1 : 0;
        if(ne==false && po==true)start=1;
        for(int i=start; i<len; i++){
            int a=1;
            for(int j=1; j<len-i; j++){
                a*=10;
            }
            answer+=(s.charAt(i)-'0')*a;
        }
        return ne ? -answer : answer;
    }
}