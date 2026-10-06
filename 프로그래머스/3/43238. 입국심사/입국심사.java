class Solution {
    public long solution(int n, int[] times) {
        long answer=0;
        long min=1;
        long max=0;
        for(int time:times){
            max=Math.max(max,time);
        }
        max*=n;
        while(min<=max){
            long mid=(min+max)/2;
            long cnt=0;
            for(int time:times){
                cnt+=mid/time;
            }
            if(cnt>=n){
                answer=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return answer;
    }
}