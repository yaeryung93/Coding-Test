import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> str=new ArrayList<>();
        str.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(words[i-1].charAt(words[i-1].length()-1) 
               == words[i].charAt(0) && !str.contains(words[i]))
                str.add(words[i]);
            else{
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }
        }
        return answer;
    }
}