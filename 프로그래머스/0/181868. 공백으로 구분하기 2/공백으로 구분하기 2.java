class Solution {
    public String[] solution(String my_string) {
        
        int cnt=0;
        int idx=0;
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)!=' ' &&
                (i==0 || my_string.charAt(i-1)==' ')) 
                cnt++;
        }
        
        String[] answer = new String[cnt];
        
        for(int i=0; i<answer.length;){
            
            answer[i]="";
            while(idx < my_string.length() && my_string.charAt(idx)==' ')
                idx++;

            while(idx<my_string.length() && my_string.charAt(idx)!=' '){
                answer[i]+=my_string.charAt(idx);
                idx++;
            }

            if(!answer[i].equals("")) i++;
        }
        
        return answer;
    }
}