class Solution {
    public String solution(String s, int n) {
        String num="";
        for(int i=1; i<=n; i++){
            num="";
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)==' ')
                    num+=s.charAt(j);
                else if(s.charAt(j)=='Z'||s.charAt(j)=='z')
                    num+=(char)(s.charAt(j)-25);
                else
                    num+=(char)(s.charAt(j)+1);
            }
            s=num;
        }
        return num;
    }
}