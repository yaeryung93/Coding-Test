import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i=0; i<intStrs.length; i++){
            String ret="";
            for(int j=s; j<s+l; j++)
                ret+=intStrs[i].charAt(j);
            if(Integer.parseInt(ret)>k)
                num.add(Integer.parseInt(ret));
        }
        int[] answer = new int[num.size()];
        for(int i=0; i<answer.length; i++)
            answer[i]=num.get(i);
        return answer;
    }
}