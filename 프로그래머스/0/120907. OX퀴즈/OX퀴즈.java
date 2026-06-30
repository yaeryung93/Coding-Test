class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<answer.length; i++){
            String[] str=quiz[i].split(" ");
            if(str[1].equals("+")){
                if(str[4].charAt(0)=='-'){
                    int num=0;
                    int cnt=1;
                    for(int j=str[4].length()-1; j>0; j--, cnt*=10){
                        num+=((str[4].charAt(j)-'0')*cnt);
                    }
                    if(Integer.parseInt(str[0])+Integer.parseInt(str[2])
                        ==(num*-1))
                        answer[i]="O";
                    else
                        answer[i]="X";
                }
                else{
                    if(Integer.parseInt(str[0])+Integer.parseInt(str[2])
                        ==Integer.parseInt(str[4]))
                        answer[i]="O";
                    else
                        answer[i]="X";
                }
            }
            else
                if(str[4].charAt(0)=='-'){
                    int num=0;
                    int cnt=1;
                    for(int j=str[4].length()-1; j>0; j--, cnt*=10){
                        num+=((str[4].charAt(j)-'0')*cnt);
                    }
                    if(Integer.parseInt(str[0])-Integer.parseInt(str[2])
                        ==(num*-1))
                        answer[i]="O";
                    else
                        answer[i]="X";
                    
                }
                else{
                    if(Integer.parseInt(str[0])-Integer.parseInt(str[2])
                        ==Integer.parseInt(str[4]))
                        answer[i]="O";
                    else
                        answer[i]="X";
                }
        }
        return answer;
    }
}