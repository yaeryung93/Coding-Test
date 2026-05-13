class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(i==s){
                answer+=overwrite_string;
                if(answer.length()!=my_string.length()){
                    for(int j=i+overwrite_string.length(); j<my_string.length(); j++){
                        answer+=my_string.charAt(j);
                    }
                }
                break;
            }
            answer+=my_string.charAt(i);
        }
        return answer;
    }
}