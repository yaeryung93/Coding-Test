class Solution {
    public int solution(String my_string) {
        String str=my_string.toLowerCase();
        String[] num=str.split("[a-z]");
        int answer = 0;
        for(int i=0; i<num.length; i++)
            if(num[i].length()==0) continue;
            else answer+=Integer.parseInt(num[i]);
        return answer;
    }
}