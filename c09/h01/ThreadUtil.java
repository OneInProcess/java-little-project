package c09.h01;

public class ThreadUtil implements Runnable{

	public void incTimes(){
		ThreadUtil T2=new ThreadUtil();
		ThreadUtil T3=new ThreadUtil();
		ThreadUtil T1=new ThreadUtil();
		Thread t1=new Thread(T1);
		Thread t2=new Thread(T2);
		Thread t3=new Thread(T3);
		t1.start();
		t2.start();
		t3.start();
	}
	public void run(){
		try {
			Thread.sleep(200);
			Test test1=new Test();
			for (int i=0;i<10;i++) {

				test1.incTotalCallTimes();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
