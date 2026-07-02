class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] danger=new boolean[board.length][board.length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]==1){
                    danger[i][j]=true;
                    
                    if(i>0) danger[i-1][j]=true;
                    if(i<board.length-1) danger[i+1][j]=true;
                    
                    if(j>0) danger[i][j-1]=true;
                    if(j<board.length-1) danger[i][j+1]=true;
                    
                    if(i>0 && j>0) danger[i-1][j-1]=true;
                    if(i<board.length-1 && j>0) danger[i+1][j-1]=true;
                    
                    if(i>0 && j<board.length-1) danger[i-1][j+1]=true;
                    if(i<board.length-1 && j<board.length-1) 
                        danger[i+1][j+1]=true;
                    } 
                }
            }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(!danger[i][j]) answer++;
            }
        }
        return answer;
    }
}