/**
 *
 */
package c10.h01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Administrator
 */
public class PrimeUtil implements Runnable {

    /**
     * 计算出 start 和end 之间所有的质数，并按递增顺序放到list中
     *
     * @param start
     * @param end
     * @return
     */
    ArrayList<Long> listx = new ArrayList<Long>();
    static ArrayList<Long> lists = new ArrayList<Long>();

    PrimeUtil() {

    }

    PrimeUtil(ArrayList list) {
        this.listx = list;

    }

    public List<Long> getPrimeList(long start, long end) {//4,25
        long mod1 = (end - start) % 4;   //1
        long end1 = end - mod1;   //24
        long dis = (end1 - start) / 4;  //5 //4 5 6 7 8 // 9 10 11 12 13 //  14 15 16 17 18//  19 20 21 22 23
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        ArrayList list4 = new ArrayList();
        for (long i = start; i < start + dis; i++) {
            list1.add(i);
        }
        for (long i = start + dis; i < start + 2 * dis; i++) {
            list2.add(i);
        }
        for (long i = start + 2 * dis; i < start + 3 * dis; i++) {
            list3.add(i);
        }
        for (long i = start + 3 * dis; i < start + 4 * dis; i++) {
            list4.add(i);
        }
        for (long i = end; i > end - mod1 - 1; i--) {
            list4.add(i);
        }
//		for(int i=0;i<list4.size();i++){
//			System.out.println(list4.get(i));
//		}
        Thread t1 = new Thread(new PrimeUtil(list1));
        Thread t2 = new Thread(new PrimeUtil(list2));
        Thread t3 = new Thread(new PrimeUtil(list3));
        Thread t4 = new Thread(new PrimeUtil(list4));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<Long> listfin = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            listfin.add(lists.get(i));
        }
        Collections.sort(listfin);

        return listfin;

    }

    public void run() {
        for (int i = 0; i < this.listx.size(); i++) {
            for (long j = 2; j < this.listx.get(i) / 2 + 2; j++) {

                if (this.listx.get(i) % j == 0) {
                    break;
                } else {
                    if (j == this.listx.get(i) / 2 + 1) {
                        lists.add(this.listx.get(i));
                    }
                }
            }
        }

    }
}

