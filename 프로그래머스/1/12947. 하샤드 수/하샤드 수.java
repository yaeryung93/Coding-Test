class Solution {
    public boolean solution(int x) {
        String answer="";
        answer+=x;
        int a=0;
        for(int i=0; i<answer.length(); i++){
            a+=answer.charAt(i)-'0';
        }
        if(x%a==0) return true;
        return false;
    }
}