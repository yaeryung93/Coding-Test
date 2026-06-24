class Solution {
    public String solution(String s) {
        String answer = "";
        int idx=0;
        for(int i=0; i<s.length(); i++){
            String str="";
            str+=s.charAt(i);
            if(str.equals(" ")){
                answer+=" ";
                idx=0;
            }
            else if(idx%2==0){
                answer+=str.toUpperCase();
                idx++;
            }
            else if(idx%2==1){
                answer+=str.toLowerCase();
                idx++;
            }
        }
        return answer;
    }
}