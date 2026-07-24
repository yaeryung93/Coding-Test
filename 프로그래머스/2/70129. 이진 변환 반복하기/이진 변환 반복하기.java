class Solution {
    public int[] solution(String s) {
        int zeroCount=0;
        int cnt=1;
        while(true){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0')
                    zeroCount++;
            }
            s=s.replace("0","");
            if(s.equals("1"))
                break;
            else{
                s=Integer.toBinaryString(s.length());
                cnt++;
                System.out.println(s);
            }
        }
        int[] answer = {cnt,zeroCount};
        return answer;
    }
}