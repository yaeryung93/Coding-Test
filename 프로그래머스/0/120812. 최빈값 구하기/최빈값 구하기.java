class Solution {
    public int solution(int[] array) {
        int max=0;
        int idx=0;
        int[] count=new int[1001];
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }
        for(int i=0; i<count.length; i++){
            if(max<count[i]){
                max=count[i];
                idx=i;
            }
        }
        int same=0;
        for(int i=0; i<count.length; i++){
            same += (max==count[i]) ? 1 : 0;
        }
        if(same>1) return -1;
        return idx;
    }
}