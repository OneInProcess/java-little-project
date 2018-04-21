/**
 * 
 */
package c09.h01;

import java.util.ArrayList;
import java.util.List;



/**
 * @author Administrator
 * 
 */
public class Test {
	private static int totalCallTimes = 0;
	private static Pool pool;
	private static List<Integer> putList=new ArrayList<Integer>();
	private static List<Integer> getList=new ArrayList<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ҵ1 ����ThreadUtil�࣬ �����������ʵ����࣬ʹ���ó������н��������䵽 �������ˡ�
		new ThreadUtil().incTimes();
		if (totalCallTimes >= 1) {
			// ������
		} else {
			waitMills(1000L);
			System.out.println("totalCallTimes="+totalCallTimes);
			if (totalCallTimes > (1000L / 100L * 2)) {				
				System.out.println("��һ����������");
				// ������
			} else {
				// ������
				System.out.println("��һ����������");
			}
		}
		
		//��ҵ2 ���Pool�࣬ʹ���ó������н��������䵽 �������ˡ�
		pool=new Pool();
		
		Thread t1=new Thread(new ThreadGet());
		Thread t2=new Thread(new ThreadPut());
		t1.start();
		t2.start();
		long cost=0;
		try {
			t2.join();
			long l2=System.currentTimeMillis();
			t1.join();
			cost=System.currentTimeMillis()-l2;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		boolean flag=false;
		if(putList.size()==getList.size()){
			flag=true;
			for(int i=0;i<putList.size();i++){
				if(putList.get(i)!=getList.get(i)){
					flag=false;
					break;
				}
//				System.out.println(i);
			}
		}
		if(cost>10){
			flag=false;
		}
		if(flag){
			System.out.print("�ڶ���������");
		}else{
			System.out.print("�ڶ���������");
		}

	}

	public static void waitMills(long waitMills) {
		long start = System.currentTimeMillis();
		while ((System.currentTimeMillis() - start) < waitMills) {
			try {
				Thread.sleep(waitMills - (System.currentTimeMillis() - start));
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}

	public static void incTotalCallTimes() {		 
			waitMills(100L);
			synchronized (Test.class) {
				totalCallTimes++;	
			}
		 
	}

	public static class ThreadPut implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++){
			try {
				
				int rand=(int)(Math.random()*100);
				Thread.sleep(rand);
				putList.add(rand);
				pool.put(rand);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		
	}
	
	public static class ThreadGet implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++){
				getList.add(pool.get());
			}
			
		}
		
	}
	

}
