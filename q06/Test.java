package q06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Set findCommon(Set s1,Set s2){
		Set common=new HashSet();
		Iterator  it=s1.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			if(s2.contains(obj)){
				common.add(obj);
			}
		}
		return common;
	}

}
