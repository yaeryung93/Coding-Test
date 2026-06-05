class Solution {
    public String[] solution(String my_string) {
        
        int len=0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)==' ') len++;
        }
        
        if(len==0) return new String[]{my_string};
        
        String[] answer = new String[len+1];
        for(int i=0; i<answer.length; i++) answer[i]="";
        int idx=0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='a'&& my_string.charAt(i)<='z'){
                answer[idx]+=(char)(my_string.charAt(i));
            }
            if(my_string.charAt(i)==' ') idx++;
        }
        return answer;
    }
}