/**
 * 
 */
package q11;

import java.util.Iterator;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void find(Map  m1,Map m2){
		Iterator it=m1.keySet().iterator();
		while(it.hasNext()){
			Object key=it.next();
			if(m2.containsKey(key)){
				Object value1=m1.get(key);
				Object value2=m2.get(key);
				if(!value1.equals(value2)){
					System.out.println("key="+key+" v1="+value1+" v2="+value2);
				}
			}
		}
	}
}
