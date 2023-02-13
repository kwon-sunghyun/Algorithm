class Solution {
        public int solution(int[] array) {
            int  answer=0;
            int Max=0;
            for(int i=0; i<array.length; i++) {    
                if(array[i]>Max) {
                    Max=array[i];
                }
            }
            
            int[] count=new int[Max+1];        
            for(int j=0; j<array.length; j++) {       
                count[array[j]]++;                   
            }

            int countMax=0;
            for(int m=0; m<count.length; m++) {    
                if(count[m]>countMax) {
                    countMax=count[m];           
                    answer=m;                       
                }
            }

            int rep=0;
            for(int n=0; n<count.length; n++) {     
                if(countMax==count[n]) {           
                    rep++;                          
                }
            }

            if(rep!=1) {
                answer=-1;
            }
            return answer;
        }
    }