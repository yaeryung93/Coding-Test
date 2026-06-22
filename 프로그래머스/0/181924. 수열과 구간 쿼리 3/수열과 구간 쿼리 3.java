class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int[] str=new int[arr.length];
        for(int i=0; i<arr.length; i++)
            answer[i]=arr[i];
        for(int i=0; i<queries.length; i++){
            answer[queries[i][0]]=arr[queries[i][1]];
            answer[queries[i][1]]=arr[queries[i][0]];
            for(int j=0; j<answer.length; j++)
                arr[j]=answer[j];
        }
        return answer;
    }
}