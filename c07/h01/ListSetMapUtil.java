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

	//��ɼ��ϵĲ���������������������
	public Set union(Set set1,Set set2){
		set1.addAll(set2);
		return set1;
		
	}
	
	//��ɼ��ϵļ�����(set1-set2 ��������set1�У��Ҳ���set2��Ԫ��)������������
	public Set diff(Set set1,Set set2){
		set1.removeAll(set2);
		return set1;
	}
	
	 
}
