class Solution {
    public int solution(String myString, String pat) {
        String change="";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='A')  change+='B';
            else if(myString.charAt(i)=='B') change+='A';
        }
        if(change.contains(pat)) return 1;
        return 0;
    }
}