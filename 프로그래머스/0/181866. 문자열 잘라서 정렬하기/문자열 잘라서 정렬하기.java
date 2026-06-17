import java.util.*;
class Solution {
    public String[] solution(String myString) {
        
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(!answer[i].equals("")){
                    list.add(answer[i]);
                }
        }
        String result[]=new String[list.size()];
        for(int i=0; i<list.size(); i++)
            result[i]=list.get(i);
        return result;
    }
}