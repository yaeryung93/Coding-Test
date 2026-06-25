class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer=false;
        boolean tf1=true;
        boolean tf2=true;
        if(!x1&&!x2) tf1=false;
        if(!x3&&!x4) tf2=false;
        
        if(tf1&&tf2) answer=true;
        return answer;
    }
}