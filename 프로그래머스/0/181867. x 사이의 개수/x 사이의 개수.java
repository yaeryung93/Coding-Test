class Solution {
    public int[] solution(String myString) {
        int count=0;
        int idx=0;
        for(int i=0; i<myString.length(); i++)
            if(myString.charAt(i)=='x') count++;
        
        int[] answer = new int[count+1];
        
        for(int i=0; i<myString.length(); i++){
            int num=0;
            while(i<myString.length() && idx<answer.length && myString.charAt(i)!='x'){
                num++;
                i++;
            }
            answer[idx]=num;
            idx++;
        }
        return answer;
    }
}