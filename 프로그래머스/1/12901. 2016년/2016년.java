class Solution {
    public String solution(int a, int b) {
        String[] day={"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        switch(a){
            case 1:
                return day[(b+4)%7];
            case 2:
                return day[(b)%7];
            case 3:
                return day[(b+1)%7];
            case 4:
                return day[(b+4)%7];
            case 5:
                return day[(b+6)%7];
            case 6:
                return day[(b+2)%7];
            case 7:
                return day[(b+4)%7];
            case 8:
                return day[(b)%7];
            case 9:
                return day[(b+3)%7];
            case 10:
                return day[(b+5)%7];
            case 11:
                return day[(b+1)%7];
            case 12:
                return day[(b+3)%7];
        }
        return "";
    }
}