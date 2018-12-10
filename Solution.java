public class Solution {

    public static void main(String[] args) {
       
    	int[][]a =new int[5][5]; 
    	int count1=0;
    	int count2=0;
    	int diff=0;
    	for(int i=0;i<a.length;i++){
    		for(int j=0;j<a.length;j++){
    			if(i==j){
    				count1=count1+a[i][j];
    			}
    			if((i+j)==((a.length+1)-2)){
    				count2=count2+a[i][j];

    			}
    	    	diff=Math.abs(count1-count2);

    		}
    	}
    }
}