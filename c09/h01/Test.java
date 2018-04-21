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
		// 作业1 完善ThreadUtil类， 可以再增加适当的类，使得让程序运行结果最后能落到 “做对了”
		new ThreadUtil().incTimes();
		if (totalCallTimes >= 1) {
			// 做错了
		} else {
			waitMills(1000L);
			System.out.println("totalCallTimes="+totalCallTimes);
			if (totalCallTimes > (1000L / 100L * 2)) {				
				System.out.println("第一道题做对了");
				// 做对了
			} else {
				// 做错了
				System.out.println("第一道题做错了");
			}
		}
		
		//作业2 完成Pool类，使得让程序运行结果最后能落到 “做对了”
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
			System.out.print("第二道做对了");
		}else{
			System.out.print("第二道做错了");
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
