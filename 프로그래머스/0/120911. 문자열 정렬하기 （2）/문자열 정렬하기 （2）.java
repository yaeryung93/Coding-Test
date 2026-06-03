import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] string=new char[my_string.length()];
        for(int i=0; i<string.length; i++){
            if(my_string.charAt(i)<'a')
                string[i]=(char)(my_string.charAt(i)+32);
            else string[i]=my_string.charAt(i);
        }
        Arrays.sort(string);
        String answer = "";
        for(int i=0; i<string.length; i++){
            answer+=string[i];
        }
        return answer;
    }
}