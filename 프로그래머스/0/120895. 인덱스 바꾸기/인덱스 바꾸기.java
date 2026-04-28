class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char n1=my_string.charAt(num1);
            char n2=my_string.charAt(num2);
            
            if(i==num1){
                answer+=n2;
            }
            else if(i==num2){
                answer+=n1;
            }
            else{
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}