import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int[] comp=new int[array.length];
        for(int i=0; i<array.length; i++){
            if(array[i]>n) comp[i]=(array[i]-n);
            else comp[i]=(n-array[i]);
        }
        int num=comp[0];
        int idx=0;
        for(int i=0; i<comp.length; i++){
            if(comp[i]<num){
                idx=i;
                num=comp[i];
            }
        }
        answer=array[idx];
        return answer;
    }
}