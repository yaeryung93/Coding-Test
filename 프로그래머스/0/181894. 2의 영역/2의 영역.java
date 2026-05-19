class Solution {
    public int[] solution(int[] arr) {
        int start=-1;
        int end=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                start=i;
                break;
            }
        }
        for(int j=arr.length-1; j>=0; j--){
            if(arr[j]==2){
                end=j;
                break;
            }
        }
        if(start==-1 && end==-1){
            return new int[]{-1};
        }
        int idx=0;
        int[] answer = new int[end-start+1];
        for(int i=start; i<=end; i++){
            answer[idx]=arr[i];
            idx++;
        }
        return answer;
    }
}