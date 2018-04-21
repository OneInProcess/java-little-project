package q09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 findMaxFq("sdfasdfsadfdsafwerwerew");
	}
	public static void findMaxFq(String content){
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<content.length()-1;i++){
			String key=content.substring(i,i+2);
			if(map.containsKey(key)){
				int value=map.get(key);
				map.put(key, value+1);
			}else{
				map.put(key, 1);
			}
		}
		Iterator<Entry<String,Integer>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String,Integer> entry=it.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}

}
