import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> tag=new HashMap<>();
        
        int[] answer = new int[photo.length];
        
        for(int i=0; i<name.length; i++){
            tag.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(tag.containsKey(photo[i][j])){
                    answer[i]+=tag.get(photo[i][j]);
                }
            }
        }
        
        return answer;
    }
}