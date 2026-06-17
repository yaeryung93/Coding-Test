class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stc=s.split(" ");
        int max=Integer.parseInt(stc[0]);
        int min=Integer.parseInt(stc[0]);
        for(int i=1; i<stc.length; i++){
            if(max<Integer.parseInt(stc[i])) max=Integer.parseInt(stc[i]);
            if(min>Integer.parseInt(stc[i])) min=Integer.parseInt(stc[i]);
        }
        answer+=min;
        answer+=" ";
        answer+=max;
        return answer;
    }
}