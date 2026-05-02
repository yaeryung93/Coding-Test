class Solution {
    public int solution(int num, int k) {
        int a = num;
        int i = 0;
        int length = 0;
        int answer = -1;

        if (num == 0) {
            length = 1;
        } else {
            int temp = num;
            while (temp > 0) {
                length++;
                temp /= 10;
            }
        }

        while (a > 0) {
            i++;

            if (a % 10 == k) {
                answer = length - i + 1;
            }

            a /= 10;
        }

        return answer;
    }
}