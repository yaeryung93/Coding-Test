class Solution {
    public String[] solution(String[] strArr) {
        int len=0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                len+=0;
            }
            else{
                len++;
            }
        }
        int a=0;
        String[] answer = new String[len];
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                len+=0;
            }
            else{
                answer[a]=strArr[i];
                a++;
            }
        }
        return answer;
    }
}