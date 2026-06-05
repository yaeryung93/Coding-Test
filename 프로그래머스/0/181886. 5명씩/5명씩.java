class Solution {
    public String[] solution(String[] names) {
        
        int len=(names.length + 4) / 5;
        
        int a=0;
        
        String[] answer = new String[len];
        
        for(int i=0; i<answer.length; i++, a+=5){
            answer[i]=names[a];
        }
        
        return answer;
    }
}