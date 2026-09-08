import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        HashMap<Integer, Integer> list=new HashMap<Integer, Integer>();
        int[] answer1={1,2,3,4,5};
        int[] answer2={2,1,2,3,2,4,2,5};
        int[] answer3={3,3,1,1,2,2,4,4,5,5};
        list.put(1, 0);
        list.put(2, 0);
        list.put(3, 0);
        for(int i=0; i<answers.length; i++){
            if(answers[i]==answer1[i%5])
                list.put(1, list.get(1)+1);
            if(answers[i]==answer2[i%8])
                list.put(2, list.get(2)+1);
            if(answers[i]==answer3[i%10])
                list.put(3, list.get(3)+1);
        }
        int maxValue=Collections.max(list.values());
        int idx=0;
        for(int i:list.values()){
            if(i==maxValue) idx++;
        }
        int[] answer = new int[idx];
        idx=0;
        for(int i:list.keySet()){
            if(list.get(i)==maxValue) answer[idx++]=i;
        }
        Arrays.sort(answer);
        return answer;
    }
}