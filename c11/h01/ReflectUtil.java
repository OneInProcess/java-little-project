package c11.h01;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReflectUtil {
	/**
	 * 从配置文件中读取数据，根据class_name 实例化， prop中的name指定了属性名 value 指定了属性值（本项目只考虑字符串类型属性）
	 * 如何从xml文件读取属性，这个方法已经实现了
	 * @param configFileName
	 * @return
	 * @throws Exception
	 */
	public Object createObjectByConfig(String configFileName) throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File(configFileName));
		Element root = document.getDocumentElement();
		NodeList classList = root.getElementsByTagName("class");

		Node classDef = classList.item(0);
		NamedNodeMap classDefAtts = classDef.getAttributes();
		String className=classDefAtts.getNamedItem("class_name").getNodeValue();
//		System.out.println("class_name="+className);

		NodeList propList = classDef.getChildNodes();

		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
//      String classNames[]=new String[propList.getLength()];
//      String valueNames[]=new String[propList.getLength()];
		for (int i = 0; i < propList.getLength(); i++) {
			Node prop = propList.item(i);
			if (prop.getNodeType() == Node.ELEMENT_NODE) {
				NamedNodeMap propMap = prop.getAttributes();
				String propName=propMap.getNamedItem("name").getNodeValue();
				String propValue=propMap.getNamedItem("value").getNodeValue();
//				System.out.println("prop_name="
//						+ propName );
				list1.add(propName);
//				System.out.println("prop_value="
//						+ propValue);
				list2.add(propValue);
			}
		}
		String classNames[]=new String[list1.size()];
        String valueNames[]=new String[list2.size()];
		for(int i=0;i<list1.size();i++){
			classNames[i]=list1.get(i).toString();
			classNames[i]="set"+classNames[i].substring(0,1).toUpperCase()+classNames[i].substring(1);
			valueNames[i]=list2.get(i).toString();
//			System.out.println(classNames[i]);
//			System.out.println(valueNames[i]);
		}
		Object obj=createObject(className);
		for(int i=0;i<valueNames.length;i++){
			dynamicInvokeMethod2(obj,classNames[i],valueNames[i]);
		}
		return obj;
	}
	public static Object createObject(String argclassName) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException,NoSuchMethodException, SecurityException  {
			Class clazz=Class.forName(argclassName);
			Object obj1=clazz.newInstance();

		return obj1;
	}
	public static Object dynamicInvokeMethod2(Object obj2,String methodName2,Object... values2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException{
//		Class[] classes=new Class[argsClassNames2.length];
//		for(int i=0;i<classes.length;i++){
//			classes[i]=Class.forName(argsClassNames2[i]);
//		}
		Method method=obj2.getClass().getMethod(methodName2,String.class);
		return method.invoke(obj2,values2);
	}



}
