class Solution {
    public String[] solution(String[] str_list) {
        int idx=0;
        int LR=0;
        String[] answer;
        for(int i=0; i<str_list.length; i++,idx++){
            if(str_list[i].equals("l")){
                LR=1;
                break;
            }
            else if(str_list[i].equals("r")){
                LR=2;
                break;
            }
        }

        if(LR==1){
            answer=new String[idx];
            for(int i=0; i<idx; i++) answer[i]=str_list[i];
            return answer;
        }
        else if(LR==2){
            int cnt=0;
            answer=new String[str_list.length-idx-1];
            for(int i=(idx+1); i<str_list.length; i++){
                answer[cnt++]=str_list[i];
            }
            return answer;
        }
        answer=new String[0];
        return answer;
    }
}