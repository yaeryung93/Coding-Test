class Solution {
    public int solution(int[] sides) {
        int compidx=0;
        int a=0;
        for(int i=0; i<3; i++){
            if(sides[i]>=sides[compidx]) compidx=i;
        }
        for(int i=0; i<3; i++){
            if(i!=compidx) a+=sides[i];
        }
        return (sides[compidx]<a) ? 1 : 2;
    }
}