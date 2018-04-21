package q07;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List findCommon(List l1,List l2){
		List common=new ArrayList();
		for(int i=0;i<l1.size();i++){
			Object obj=l1.get(i);
			for(int j=0;j<l2.size();j++){
				if(obj.equals(l2.get(j))){
					common.add(obj);
				}
			}
		}
		return common;
	}
}
