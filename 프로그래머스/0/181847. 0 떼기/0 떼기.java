class Solution {
    public String solution(String n_str) {
        String answer = "";
        int a=0;
        while(a<n_str.length() && n_str.charAt(a)=='0'){
            a++;
        }
        answer=n_str.substring(a);
        return answer;
    }
}