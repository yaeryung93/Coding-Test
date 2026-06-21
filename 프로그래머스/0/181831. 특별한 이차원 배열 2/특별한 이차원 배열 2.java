class Solution {
    public int solution(int[][] arr) {
        int num = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]==arr[j][i]) num++;
            }
        }
        if(num==arr.length*arr.length) return 1;
        return 0;
    }
}