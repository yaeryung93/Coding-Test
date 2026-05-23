class Solution {
    public int solution(String my_string, String is_prefix) {
        String pre="";
        for(int i=0; i<my_string.length(); i++){
            pre+=(char)my_string.charAt(i);
            if(pre.equals(is_prefix)) return 1;
        }
        return 0;
    }
}