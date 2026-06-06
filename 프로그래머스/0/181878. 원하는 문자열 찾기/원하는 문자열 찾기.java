class Solution {
    public int solution(String myString, String pat) {
        String my="";
        String pt="";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)<'a') my+=(char)(myString.charAt(i)+32);
            else my+=myString.charAt(i);
        }
        for(int i=0; i<pat.length(); i++){
            if(pat.charAt(i)<'a') pt+=(char)(pat.charAt(i)+32);
            else pt+=pat.charAt(i);
        }
        return (my.contains(pt)) ? 1 : 0;
    }
}