class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0; i<order.length; i++){
            String mean=order[i];
            if(mean.equals("iceamericano") || mean.equals("americanoice") || mean.equals("anything")){
                answer+=4500;
            }
            else if(mean.equals("hotamericano") || mean.equals("americanohot") || mean.equals("americano")){
                answer+=4500;
            }
            else if(mean.equals("cafelatteice") || mean.equals("icecafelatte") || mean.equals("cafelatte") || mean.equals("hotcafelatte") || mean.equals("cafelattehot")){
                answer+=5000;
            }
        }
        return answer;
    }
}