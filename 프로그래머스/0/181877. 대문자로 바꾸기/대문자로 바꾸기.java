class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char a=myString.charAt(i);
            if( a>=97){
                answer+=(char)(a-32);
            }
            else{
                answer+=(char)a;
            }
        }
        return answer;
    }
}