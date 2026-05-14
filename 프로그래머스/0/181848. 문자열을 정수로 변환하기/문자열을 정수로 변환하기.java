class Solution {
    public int solution(String n_str) {
        int answer = 0;
        int a=1;
        int len=n_str.length();
        for(int i=0; i<len; i++){
            answer+=(n_str.charAt(len-1-i)-'0')*a;
            a*=10;
        }
        return answer;
    }
}