class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i<=j; i++){
            String km="";
            km+=i;
            for(int a=0; a<km.length(); a++){
                if((km.charAt(a)-'0')==k) answer++;
            }
        }
        return answer;
    }
}