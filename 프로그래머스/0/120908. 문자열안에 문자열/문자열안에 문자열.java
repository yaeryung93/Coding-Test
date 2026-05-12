class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int len=str2.length();
        for(int i=0; i<str1.length(); i++){
            if((i+len)>str1.length()) break;
            String a="";
            for(int j=0; j<len; j++){
                a+=str1.charAt(i+j);
            }
            if(a.equals(str2)){
                answer=1;
            }
        }
        return answer;
    }
}