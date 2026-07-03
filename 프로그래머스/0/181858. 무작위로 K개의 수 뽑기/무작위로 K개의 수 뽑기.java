
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer=new int[k];

        for (int i = 0; i < k; i++)
            answer[i]=-1;

        int idx=0;

        for (int i=0; i<arr.length; i++) {
            boolean exists=false;

            for (int j=0; j<idx; j++){
                if (answer[j]==arr[i]){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                answer[idx]=arr[i];
                idx++;
            }
            if(idx==k) break;

        }
        return answer;
    }
}