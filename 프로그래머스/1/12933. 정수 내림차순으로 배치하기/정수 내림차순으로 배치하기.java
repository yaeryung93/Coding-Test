import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String num="";
        num+=n;
        Integer[] number=new Integer[num.length()];
        for(int i=0; i<num.length(); i++){
            number[i]=(num.charAt(i)-'0');
        }
        Arrays.sort(number);
        long a=1;
        for(int i=0; i<number.length; i++){
            answer+=number[i]*a;
            a*=10;
        }
        return answer;
    }
}