class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) return 0;

        for(int i=1; i<=A.length(); i++){
            String str = "";
            str+=A.charAt(A.length()-1);
            for(int j=0; j<A.length()-1; j++){
            str += A.charAt(j);
            }
            A=str;
            if(A.equals(B)) return i;
    
        }
        return -1;
    }
}