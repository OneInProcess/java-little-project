package c09.h01;

/**
 * Created by hasee on 2016/10/19.
 */
public class Pool {
    int array[]=new int[10];
    int n=0,m=-1;
    int temp=0;
    public synchronized int get()  {
        this.notify();
        while (array[m+1]==0){
            try{this.wait();
            }catch (InterruptedException e){
        }

    }
        m++;
        return array[m];
    }

    public synchronized void put(int n1) throws InterruptedException {
        this.notify();
        while (n1==temp){
            this.wait();
        }
        array[n]=n1;
        temp=array[n];
        n++;
    }
}
