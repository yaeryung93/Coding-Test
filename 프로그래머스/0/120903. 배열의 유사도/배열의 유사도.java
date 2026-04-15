class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i=0; i<s1.length; i++){
            for(int a=0; a<s2.length; a++){
                if(s1[i].equals(s2[a])){
                    answer+=1;
                }
            }
        }
        return answer;
    }
}