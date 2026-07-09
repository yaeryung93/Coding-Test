class Solution {
    public String solution(String my_string, int s, int e) {
        String str=my_string.substring(s,e+1);
        StringBuilder rever=new StringBuilder(str);
        return my_string.substring(0,s)+rever.reverse().toString()+my_string.substring(e+1);
    }
}