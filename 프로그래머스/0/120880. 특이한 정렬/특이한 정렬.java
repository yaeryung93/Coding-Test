class Solution {
    public int[] solution(int[] num, int n) {
        for(int i=0; i<num.length-1; i++){
            for(int j=(i+1); j<num.length; j++){
                int ni=Math.abs(num[i]-n);
                int nj=Math.abs(num[j]-n);
                if(ni>nj||(ni==nj&&num[i]<num[j])){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;                    
                }
            }
        }
        return num;
    }
}