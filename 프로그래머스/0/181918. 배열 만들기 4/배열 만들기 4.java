import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0; i<arr.length;){
            if(num.isEmpty()){
                num.add(arr[i]);
                i++;
            }
            else{
                if(num.get(num.size()-1)<arr[i]){
                    num.add(arr[i]);
                    i++;
                }
                else{
                    num.remove(num.size()-1);
                }
            }
        }
        int[] stk = new int[num.size()];
        for(int i=0; i<stk.length; i++)
            stk[i]=num.get(i);
        return stk;
    }
}