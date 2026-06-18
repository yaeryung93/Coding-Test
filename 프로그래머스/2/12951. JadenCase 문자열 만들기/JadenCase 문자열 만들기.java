class Solution {
    public String solution(String s) {
        
        String answer = "";
        String JC=s.toLowerCase();
        
        String[] stc=JC.split(" ",-1);
        String[] Case=new String[stc.length];
        
        for(int i=0; i<stc.length; i++){
            
            if(stc[i].length()>=1){
                answer+=Character.toUpperCase(stc[i].charAt(0));
            }
            
            for(int j=1; j<stc[i].length(); j++){
                answer+=stc[i].charAt(j);
            } 
            if(i!=stc.length-1) answer+=" ";
        }
        return answer;
    }
}