class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            String a = String.valueOf(array[i]);;
            for(int j=0; j<a.length(); j++){
                if(a.charAt(j)=='7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}