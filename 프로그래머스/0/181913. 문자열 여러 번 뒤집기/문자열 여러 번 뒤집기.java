class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] str=new char[my_string.length()];
        for(int i=0; i<str.length; i++){
            str[i]=my_string.charAt(i);
        }
        for(int i =0; i<queries.length; i++){
            for(int j=queries[i][0]; j<(queries[i][0]+queries[i][1]+1)/2; j++){

                char temp = str[j];
                str[j]=str[queries[i][0]+queries[i][1]-j];
                str[queries[i][0]+queries[i][1]-j]=temp;
            }
        }
        for(int i=0; i<str.length; i++)
            answer+=str[i];
        return answer;
    }
}