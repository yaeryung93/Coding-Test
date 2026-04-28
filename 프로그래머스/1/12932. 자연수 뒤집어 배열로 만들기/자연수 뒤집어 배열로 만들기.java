class Solution {
    public int[] solution(long n) {
        int i = 0;
        long temp = n;

        while(temp>0){
            temp/=10;
            i++;
        }

        int[] answer = new int[i];
        int[] array = new int[i];

        int k = 0;
        long j = 1;

        while (k < i) {
            array[k] = (int)((n / j) % 10);
            j *= 10;
            k++;
        }

        k = 0;
        while (k < i) {
            answer[k] = array[k];
            k++;
        }
        return answer;
    }
}