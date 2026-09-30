import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer =0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int key:tangerine){
            if(!map.containsKey(key)) map.put(key, 1);
            else map.put(key, map.get(key)+1);
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort(((o1, o2)->map.get(o2)-map.get(o1)));
        for (int i:keyList) {
            if(k<=0){
                break;
            }
            answer++;
            k-=map.get(i);
        }
        return answer;
    }
}