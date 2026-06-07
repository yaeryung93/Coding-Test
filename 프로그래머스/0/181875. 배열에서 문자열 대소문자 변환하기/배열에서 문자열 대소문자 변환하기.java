class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<answer.length; i++) answer[i]="";
        for(int i=0; i<strArr.length; i++){
            for(int j=0; j<strArr[i].length(); j++){
                if(i%2==0){
                    if(strArr[i].charAt(j)>='a'){
                        answer[i]+=(char)(strArr[i].charAt(j));
                    }
                    else{
                        answer[i]+=(char)(strArr[i].charAt(j)+32);
                    }
                }
                else{
                    if(strArr[i].charAt(j)>='a'){
                        answer[i]+=(char)(strArr[i].charAt(j)-32);
                    }
                    else{
                        answer[i]+=(char)(strArr[i].charAt(j));
                    }
                }
            }
        }
        return answer;
    }
}