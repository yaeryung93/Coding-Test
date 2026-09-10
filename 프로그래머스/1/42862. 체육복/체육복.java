import java.util.HashMap;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashMap<Integer, Integer> list=new HashMap<>();
        for(int i=0; i<n; i++){
            list.put((i+1), 1);
        }
        for(int i:lost){
            list.put(i, 0);
        }
        for(int i:reserve){
            list.put(i, list.get(i)+1);
        }
        for(int key:list.keySet()){
            if(list.get(key)>=1){
                answer++;
            }
            else{
                if(key!=1 && list.get(key-1)>=2){
                    answer++;
                    list.put(key,1);
                    list.put(key-1,list.get(key-1)-1);
                }
                else if(key!=n && list.get(key+1)>=2){
                    answer++;
                    list.put(key,1);
                    list.put(key+1,list.get(key+1)-1);
                }
            }
        }
        return answer;
    }
}