/**
 * 
 */
package c07.h01;

import java.util.Set;

/**
 * @author Administrator
 *
 */
public class ListSetMapUtil {

	//完成集合的并操作，将并的其结果返回
	public Set union(Set set1,Set set2){
		set1.addAll(set2);
		return set1;
		
	}
	
	//完成集合的减操作(set1-set2 即保留在set1中，且不在set2中元素)，将其结果返回
	public Set diff(Set set1,Set set2){
		set1.removeAll(set2);
		return set1;
	}
	
	 
}
