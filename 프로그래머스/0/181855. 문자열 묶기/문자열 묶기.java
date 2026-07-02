class Solution {
    public int solution(String[] strArr) {
        int[] len=new int[30];
        for(int i=0; i<strArr.length; i++){
            len[strArr[i].length()-1]++;
        }
        int max=0;
        for(int i=0; i<len.length; i++){
            if(len[i]>=max)
                max=len[i];
        }
        return max;
    }
}