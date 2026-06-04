class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] num=new int[included.length];
        int idx=a;
        for(int i=0; i<num.length; i++, idx+=d){
            num[i]=idx;
        }
        for(int i=0; i<num.length; i++){
            answer+=(included[i]==true)? num[i]:0;
        }
        return answer;
    }
}