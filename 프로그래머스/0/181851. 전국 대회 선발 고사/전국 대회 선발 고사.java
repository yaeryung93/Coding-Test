import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        ArrayList<Integer> ranklist=new ArrayList<>();
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i]) ranklist.add(rank[i]);           
        }
        
        Collections.sort(ranklist);
        
        int a=ranklist.get(0);
        int b=ranklist.get(1);
        int c=ranklist.get(2);
        
        for(int i=0; i<rank.length; i++){
            if(rank[i]==a)
                answer+=10000*i;
            else if(rank[i]==b)
                answer+=100*i;
            else if(rank[i]==c)
                answer+=i;
        }
        return answer;
    }
}