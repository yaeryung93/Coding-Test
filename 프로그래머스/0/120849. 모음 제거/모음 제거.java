class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char v=my_string.charAt(i);
            if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u')
                answer+="";
            else{
                answer+=v;
            }
        }
        return answer;
    }
}