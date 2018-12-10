import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCount {

	public static void main(String[] args) {

        int[] array = {1,2,2,3,3,3,3};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int count;
        for(int i=0; i<array.length;i++){
        	count = array[i];
        	if(hm.containsKey(count))
        	hm.put(count, hm.get(count)+1);
        	else
            	hm.put(count, array[0]);

        }
        System.out.println("HM is "+hm);
//        Set<?> set=hm.entrySet();
//    	Iterator<?> i = set.iterator();
//    	while(i.hasNext()){
//    		@SuppressWarnings("rawtypes")
//    		Map.Entry mp = (Map.Entry)i.next();
//    		System.out.println(mp.getKey());
//    		System.out.println(mp.getValue());
//        
//	}
    	
    	for(Map.Entry<Integer, Integer> mp1:hm.entrySet()){
    		System.out.println(mp1.getKey()+" : "+mp1.getValue());
    	}
	}}

