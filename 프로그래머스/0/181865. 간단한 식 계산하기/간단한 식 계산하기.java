class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bin=binomial.split(" ");
        int num1=Integer.parseInt(bin[0]);
        int num2=Integer.parseInt(bin[2]);
        switch(bin[1]){
            case "+": 
                answer+=(num1+num2);
                break;
            case "-": 
                answer+=(num1-num2);
                break;
            case "*": answer+=(num1*num2);
        }
        return answer;
    }
}