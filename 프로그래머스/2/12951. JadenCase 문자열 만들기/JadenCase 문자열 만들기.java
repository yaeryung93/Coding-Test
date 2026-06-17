class Solution {
    public String solution(String s) {
        
        String answer = "";
        String JC=s.toLowerCase();
        
        String[] stc=JC.split(" ",-1);
        String[] Case=new String[stc.length];
        
        for(int i=0; i<stc.length; i++){
            
            if(stc[i].length()>=1){
                if((stc[i].charAt(0)<='z'&&stc[i].charAt(0)>='a') 
                   || (stc[i].charAt(0)>='A' && stc[i].charAt(0)<='Z'))
                    answer+=(char)(stc[i].charAt(0)-32);
                
                else if(stc[i].charAt(0)<='9'&& stc[i].charAt(0)>='0')
                    answer+=(char)(stc[i].charAt(0));
            }
            
            for(int j=1; j<stc[i].length(); j++){
                answer+=stc[i].charAt(j);
            } 
            if(i!=stc.length-1) answer+=" ";
        }
        return answer;
    }
}