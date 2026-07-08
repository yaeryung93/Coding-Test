class Solution {
    public int solution(int a, int b) {
        int ab=Integer.parseInt(a+""+b);
        int ba=(2*a*b);
        if(ab>=ba) return ab;
        else return ba;
    }
}