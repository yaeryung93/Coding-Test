class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0; i<letter.length(); i++){
            String ms="";
            while(i<letter.length() && letter.charAt(i)!=' '){
                ms+=letter.charAt(i);
                i++;
            }
            for(int j=0; j<morse.length; j++){
                if(ms.equals(morse[j])){
                    answer+=(char)(97+j);
                    break;
                }
            }
        }
        return answer;
    }
}