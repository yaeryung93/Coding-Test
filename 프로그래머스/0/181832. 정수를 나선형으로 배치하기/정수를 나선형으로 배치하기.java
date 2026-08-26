class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int cnt=1;
        for(int i=0; i<(n+1)/2; i++){
            for(int j=i; j<n-i; j++){
                answer[i][j]=cnt++;
            }
            for(int j=(i+1); j<n-i; j++){
                answer[j][n-i-1]=cnt++;
            }
            for(int j=(n-i-2); j>=i; j--){
                answer[n-i-1][j]=cnt++;
            }
            for(int j=(n-i-2); j>i; j--){
                answer[j][i]=cnt++;
            }
        }
        return answer;
    }
}