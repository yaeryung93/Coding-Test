class Solution {
    public String solution(String s) {
        String answer="";
        if(s.length()%2==1){
            answer+= (s.charAt(s.length()/2));
        }
        else{
            for(int i=(s.length()/2-1); i<s.length()/2+1; i++){
                answer+=s.charAt(i);
            }
        }
        return answer;
    }
}