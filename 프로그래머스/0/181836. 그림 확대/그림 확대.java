class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx=0;
        for(int i=0; i<answer.length; i++)
            answer[i]="";
        for(int i=0; i<picture.length; i++){
            for(int j=1; j<=k; j++){
                for(int l=0; l<picture[i].length(); l++){
                    for(int n=1; n<=k; n++)
                        answer[idx]+=picture[i].charAt(l);
                }
                idx++;
            }
        }
        return answer;
    }
}