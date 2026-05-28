class Solution {
    public String solution(String code) {
        String answer = "";
        int mode=0;
        for(int i=0; i<code.length(); i++){
            if(code.charAt(i)=='1' && mode==0){
                mode=1;
                continue;
            }
            else if(code.charAt(i)=='1' && mode==1) mode=0;
            if(mode==0){
                if(i%2==0 && code.charAt(i)!='1') answer+=code.charAt(i);
            }
            else{
                if(i%2==1 && code.charAt(i)!='1') answer+=code.charAt(i);
            }
        }
        if(answer.equals("")) return "EMPTY";
        return answer;
    }
}