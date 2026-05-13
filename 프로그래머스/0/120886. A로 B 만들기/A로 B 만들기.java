class Solution {
    public int solution(String before, String after) {
        for(int i=0; i<before.length(); i++){
            
            int num=0;
            
            for(int j=0; j<before.length(); j++){
                if(before.charAt(j)==before.charAt(i)) num++;
            }
            
            for(int j=0; j<after.length(); j++){
                if(after.charAt(j)==before.charAt(i)) num--;
            }
            
            if(num!=0) return 0;
        }
        
        return 1;
    }
}