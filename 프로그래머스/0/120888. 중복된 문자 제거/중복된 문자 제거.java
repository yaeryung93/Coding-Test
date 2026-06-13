class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            boolean exist = false;

            for(int j=0; j<answer.length(); j++){
                if(answer.charAt(j)==ch){
                    exist=true;
                    break;
                }
            }

            if(!exist) answer += ch;
        }
        return answer;
    }
}