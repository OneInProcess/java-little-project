package c01.h03;

public class Cat {
    static Integer count=0 ;

    public Cat() {

        count++;

    }

    public int getTotalCount() {
        return count;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Cat();
        //�м䲻һ����ʼ�����ٴ�
        new Cat();
        new Cat();
        System.out.println(new Cat().getTotalCount()-1);
    }

}
