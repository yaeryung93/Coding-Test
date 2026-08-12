class Solution {
    public int solution(int[][] dots) {
        double inclination1=
         (double)(dots[0][1]-dots[1][1])/(dots[0][0]-dots[1][0]);
        double inclination2=
         (double)(dots[2][1]-dots[3][1])/(dots[2][0]-dots[3][0]);
                                             
        double inclination3=
         (double)(dots[0][1]-dots[2][1])/(dots[0][0]-dots[2][0]);
        double inclination4=
         (double)(dots[3][1]-dots[1][1])/(dots[3][0]-dots[1][0]);
                                             
        double inclination5=
         (double)(dots[0][1]-dots[3][1])/(dots[0][0]-dots[3][0]);
        double inclination6=
         (double)(dots[2][1]-dots[1][1])/(dots[2][0]-dots[1][0]);
        
        if(inclination1==inclination2 ||
            inclination3==inclination4 ||
            inclination5==inclination6)
                return 1;
        return 0;
    }
}