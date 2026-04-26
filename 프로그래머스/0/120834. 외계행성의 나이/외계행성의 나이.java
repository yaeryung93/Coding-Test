class Solution {
    public String solution(int age) {
        String answer = "";
        while(age > 0){
            int b = age % 10;
            switch(b){
                case 0: answer = "a" + answer; break;
                case 1: answer = "b" + answer; break;
                case 2: answer = "c" + answer; break;
                case 3: answer = "d" + answer; break;
                case 4: answer = "e" + answer; break;
                case 5: answer = "f" + answer; break;
                case 6: answer = "g" + answer; break;
                case 7: answer = "h" + answer; break;
                case 8: answer = "i" + answer; break;
                case 9: answer = "j" + answer; break;
            }

            age /= 10;
        }
        return answer;
    }
}