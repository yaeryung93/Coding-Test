class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num1=0;
        int num2=0;
        String[] poly=polynomial.split(" ");
        for(int i=0; i<poly.length; i++){
            if(poly[i].equals("+"))
                continue;
            else if(poly[i].contains("x")){
                String number="";
                if(poly[i].length()==1)
                    num1++;
                else
                    for(int j=0; j<poly[i].length(); j++){
                        if(poly[i].charAt(j)!='x')
                            number+=(poly[i].charAt(j));
                    }
                if(number.length()>=1)
                    num1+=Integer.parseInt(number);
            }
            else
                num2+=Integer.parseInt(poly[i]);
        }
        if(num1==1)
            answer+="x";
        else if(num1>1)
            answer+=(num1+"x");
        
        if(num1>0 && num2>0)
            answer+=(" + "+num2);
        else if(num2>0)
            answer+=num2;
            
        return answer;
    }
}