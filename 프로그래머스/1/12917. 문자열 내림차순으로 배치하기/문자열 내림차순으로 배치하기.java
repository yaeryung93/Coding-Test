import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] spl=new char[s.length()];
        for(int i=0; i<spl.length; i++)
            spl[i]=s.charAt(i);
        Arrays.sort(spl);
        for(int i=spl.length-1; i>=0; i--)
            answer+=spl[i];
        return answer;
    }
}