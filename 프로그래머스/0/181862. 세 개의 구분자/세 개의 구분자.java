class Solution {
    public String[] solution(String myStr) {
        String[] answer;
        String[] str = myStr.split("a|b|c");
        int idx=0;
        for(int i=0; i<str.length; i++){
            if(str[i].length()==0) continue;
            else idx++;
        }
        if(idx==0) return answer=new String[]{"EMPTY"};
        answer=new String[idx];
        idx=0;
        for(int i=0; i<str.length; i++){
            if(str[i].length()==0) continue;
            else{
                answer[idx]=str[i];
                idx++;
            }
        }
        return answer;
    }
}