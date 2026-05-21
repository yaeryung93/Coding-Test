class Solution {
    public int[] solution(int[] arr) {
        int num = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < num) {
                num = arr[i];
            }
        }

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                answer[idx] = arr[i];
                idx++;
            }
        }

        return answer;
    }
}