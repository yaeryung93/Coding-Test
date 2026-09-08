class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++){
            
            String[] ch=skill_trees[i].split("");
            int cnt=0;
            boolean possible=true;
            
            for(int j=0; j<ch.length; j++){
                if(skill.contains(ch[j])){ 
                    if(skill.charAt(cnt)==ch[j].charAt(0)) cnt++;
                    else{
                        possible=false;
                        break;
                    }                
                } 
            }
            if(possible) answer++;
            
        }
        return answer;
    }
}