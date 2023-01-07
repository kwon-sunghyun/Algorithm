import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> hamber = new ArrayList();
        
        for (int i=0; i<ingredient.length; i++) {
        	hamber.add(ingredient[i]);
        	if (hamber.size()>3 && 
        			hamber.get(hamber.size()-4)==1 &&
        			hamber.get(hamber.size()-3)==2 &&
        			hamber.get(hamber.size()-2)==3 &&
        			hamber.get(hamber.size()-1)==1) 
           
            { answer++;
        		for(int j=0; j<4; j++) {
        			hamber.remove(hamber.size()-1);
        		}
        	}
        }
        return answer;
    }
}