class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        if(n==1){
            answer=new int[slicer[1]+1];
            for(int i=0; i<answer.length; i++){
                answer[i]=num_list[i];
            }
        }
        
        else if(n==2){
            answer=new int[num_list.length-slicer[0]];
            int idx=slicer[0];
            for(int i=0; i<answer.length; i++){
                answer[i]=num_list[idx];
                if(idx<num_list.length) idx++;
            }
        }
        
        else if(n==3){ 
            answer=new int[slicer[1]-slicer[0]+1];
            int idx=slicer[0];
            for(int i=0; i<answer.length; i++){
                answer[i]=num_list[idx];
                if(idx<num_list.length) idx++;
            }
            
        }
        
        else{
            answer=new int[(slicer[1]-slicer[0])/slicer[2]+1];
            int idx=slicer[0];
            for(int i=0; i<answer.length; i++){
                answer[i]=num_list[idx];
                if(idx<num_list.length) idx+=slicer[2];
            }
        }
        
        return answer;
    }
}