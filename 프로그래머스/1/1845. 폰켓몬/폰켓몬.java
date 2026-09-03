import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> num=new HashMap<>();
        for(int i:nums){
            if(!num.containsKey(i)){
                num.put(i, 1);
            }
            else{
                num.put(i, num.get(i)+1);
            }
        }
        return Math.min(num.size(), nums.length/2);
    }
}