import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> list=new HashMap<>();
        for(String str:participant){
            if(!list.containsKey(str)){
                list.put(str, 1);
            }
            else{
                list.put(str, list.get(str)+1);
            }
        }
        for(String str:completion){
            list.put(str, list.get(str)+1);
        }
        for(String str:list.keySet()){
            if(list.get(str)%2==1){
                return str;
            }
        }
        
        return "";
    }
}