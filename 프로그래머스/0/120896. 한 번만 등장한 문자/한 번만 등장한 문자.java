import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] abc=new int[26];
        for(int i=0; i<s.length(); i++){
            abc[s.charAt(i)-'a']++;
        }
        int idx=0;
        for(int i=0; i<s.length(); i++){
            if(abc[s.charAt(i)-'a']==1){
                idx++;
            }
        }
        char[] str=new char[idx];
        idx=0;
        for(int i=0; i<s.length(); i++){
            if(idx<s.length() && abc[s.charAt(i)-'a']==1){
                str[idx]=s.charAt(i);
                idx++;
            }
        }
        Arrays.sort(str);
        for(int i=0; i<str.length; i++)
            answer+=(char)str[i];
        return answer;
    }
}