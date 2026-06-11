class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    len++;
                }
            }
        }
        int idx=0;
        int[] answer = new int[arr.length-len];
        for(int i=0; i<arr.length; i++){
            int cnt=0;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]) continue;
                else cnt++;
            }
            if(idx<answer.length && cnt==delete_list.length){
                answer[idx]=arr[i];
                idx++;
            }
        }
        return answer;
    }
}