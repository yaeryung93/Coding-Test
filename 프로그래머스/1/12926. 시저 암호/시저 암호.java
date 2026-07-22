class Solution {
    public String solution(String s, int n) {
        for(int i=1; i<=n; i++){
            String temp="";
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)==' ')
                    temp+=s.charAt(j);
                else if(s.charAt(j)=='Z'||s.charAt(j)=='z')
                    temp+=(char)(s.charAt(j)-25);
                else
                    temp+=(char)(s.charAt(j)+1);
            }
            s=temp;
        }
        return s;
    }
}