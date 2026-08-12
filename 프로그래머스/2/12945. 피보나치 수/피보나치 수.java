import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(0);
        num.add(1);
        for(int i=1; i<=n; i++){
            num.add((num.get(i-1)+num.get(i))%1234567);
        }
        return num.get(n);
    }
}