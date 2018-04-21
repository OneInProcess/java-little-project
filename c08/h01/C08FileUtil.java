//
//package c08.h01;
//
//import java.io.File;
//import java.util.*;
//import java.util.List;
//import java.util.TreeSet;
//
//public class C08FileUtil {
//
//    /**
//     * 遍历 homeDir下面所有的文件（包括子目录），将每个文件名放到 一个List中返回
//     * 也可以增加新的方法,可以增加新的类
//     *
//     * @param homeDir
//     * @param field   按哪个属性排序
//     * @param order   按升序还是降序 排序时候文件不区分大小写
//     * @return 文件名（不包括目录名）排序好以后放到List里面返回
//     */
//    static String a;
//    static String b;
//
//    public List<String> listAllFiles(String homeDir, EnumField field,
//                                     EnumListOrder order) throws Exception {
//        // 提示
//        // 1 递归遍历文件
//        // 2 把File放到一个TreeSet中
//        // 3 定义Comparator类
//        // 4 排序好的文件放到List
//        // 5 提取出List里面文件名 返回
//        //
////		File root = new File(homeDir);
////		File zi[] = root.listFiles();
//        List<File> xx = new ArrayList<File>();
//        TreeSet<File> coll = new TreeSet<>(new myComparator(field, order));
////
////
////		for (int i = 0; i < zi.length; i++) {
////			//System.out.println(zi[i]);
////			if (zi[i].isDirectory()) {
////
////				try {
////					listAllFiles(zi[i].toString(),field, order);
////				}
////				catch(Exception e){}
////			}
//////			System.out.println(zi[i]);
////			xx.add(zi[i]);
////		}
//        read(homeDir, field, order, xx);
//        File fi[] = new File[xx.size()];
//        for (int i = 0; i < xx.size(); i++) {
////			System.out.println(xx.get(i));
//            fi[i] = xx.get(i);
//            //System.out.println(fi[i]);
//            coll.add(fi[i]);
//            if (fi[i].isFile()) {
//                coll.add(fi[i]);
//                //System.out.println(fi[i]);
//            }
//        }
////		for (int i = 0; i <xx.size(); i++) {
////			System.out.println(fi[i]);
////			if(fi[i].isFile()) {
////				coll.add(fi[i]);
////			}
////		}
//        a = field.toString();
//        b = order.toString();
//        List<String> fin = new ArrayList<String>();
////		System.out.println(coll.size());
//        Object gi[] = new Object[xx.size()];
//        gi = coll.toArray();
//        for (int i = 0; i < gi.length; i++) {
//            //System.out.println(gi[i].toString());
//            File f = (File) gi[i];
////				System.out.println(f.getName());
//            if (f.isFile()) {
//                fin.add(f.getName());
//            }
//
//        }
//
//
//// Iterator<File> iterator=coll.iterator();
////		while(iterator.hasNext()){
////			File a=iterator.next();
////			if(a.toString().contains(".")) {
////
////				fin.add(a.toString().substring(a.toString().lastIndexOf("\\") + 1, a.toString().length()));
//////				System.out.println(a.toString().substring(a.toString().lastIndexOf("\\") + 1, a.toString().length()));
////
////			}
////			//System.out.println(fin.get(0));
//
////		System.out.println(fin.size());
////	    System.out.println(fin.get(0));
////		for(int i=0;i<gi.length;i++){
////			//System.out.println(gi[i].toString());
////			fin.add(gi[i].toString().substring(gi[i].toString().lastIndexOf("\\")+1,gi[i].toString().length()));
////
////			System.out.println(fin);
////		}
//        //System.out.println(fin);
//        //System.out.println(a);
//
//
//        return fin;
//    }
//
//    public void read(String homeDir, EnumField field,
//                     EnumListOrder order, List<File> xx) {
//        File root = new File(homeDir);
//        File zi[] = root.listFiles();
//        for (int i = 0; i < zi.length; i++) {
//            //System.out.println(zi[i]);
//            if (zi[i].isDirectory()) {
//
//                try {
//                    read(zi[i].toString(), field, order, xx);
//                } catch (Exception e) {
//                }
//            }
////			System.out.println(zi[i]);
//            xx.add(zi[i]);
//        }
//
//    }
//
//}
//
//class myComparator implements Comparator<File> {
//
//    String a;
//    String b;
//
//    public myComparator(EnumField field, EnumListOrder order) {
//        this.a = field.toString();
//        this.b = order.toString();
//    }
//
//    public int compare(File o, File p) {
//        if (a.equals("file_name") & b.equals(("asc"))) {
//            int x = o.getName().toLowerCase().compareTo(p.getName().toLowerCase());
//            return x;
//        }
//        if (a.equals("size") & b.equals(("asc"))) {
//            long x = o.length() - p.length();
//            int y = (int) x;
//            return y;
//        }
//        if (a.equals("mod_date") & b.equals(("asc"))) {
//            long x = o.lastModified() - p.lastModified();
//            int y = (int) x;
//            return y;
//        }
//        if (a.equals("file_name") & b.equals(("desc"))) {
//            int x = o.getName().toLowerCase().compareTo(p.getName().toLowerCase());
//            return -x;
//        }
//        if (a.equals("size") & b.equals(("desc"))) {
//            long x = o.length() - p.length();
//            int y = (int) x;
//            return -y;
//        }
//        if (a.equals("mod_date") & b.equals(("asc"))) {
//            long x = o.lastModified() - p.lastModified();
//            int y = (int) x;
//            return -y;
//        } else {
//
//
//            return 0;
//        }
//
//    }
//}
package c08.h01;

import java.io.File;
import java.util.*;

public class C08FileUtil {

    private Set<File> fileSet ;

    /**
     * 遍历 homeDir下面所有的文件（包括子目录），将每个文件名放到 一个List中返回
     * 可以增加新的类，也可以增加新的方法
     *
     * @param homeDir
     * @param field   按哪个属性排序
     * @param order   按升序还是降序 排序时候文件不区分大小写
     * @return 文件名（不包括目录名）排序好以后放到List里面返回
     */
    public List<String> listAllFiles(String homeDir, EnumField field,
                                     EnumListOrder order) throws Exception {
        // 提示
        // 1 递归遍历文件
        // 2 把File放到一个TreeSet中
        // 3 定义Comparator类
        // 4 排序好的文件放到List
        // 5 提取出List里面文件名 返回
        //

        fileSet = new TreeSet<>(new MyComparetor(field,order));

        traverseFolder2(homeDir);

        System.out.println(fileSet);
        List<String> stringList = new ArrayList<>();
        for (File file : fileSet) {
            stringList.add(file.getName());
        }
        //System.out.println(stringList);
        return stringList;
    }

    public void traverseFolder2(String path) {

        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        //fileSet.add(file2);
                        traverseFolder2(file2.getAbsolutePath());
                    } else {
                        fileSet.add(file2);
                        System.out.println("文件:" + file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    class MyComparetor implements Comparator<Object> {
        EnumField field;
        EnumListOrder order;

        public MyComparetor(EnumField field, EnumListOrder order) {
            this.field = field;
            this.order = order;
        }

        @Override
        public int compare(Object o11, Object o22) {
            int result = 0;
            File o1=(File)o11;
            File o2=(File)o22;
            if (this.field == EnumField.file_name) {
                result = o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            } else if (this.field == EnumField.mod_date) {
                result = (int) (o1.lastModified() - o2.lastModified());
            } else if (this.field == EnumField.size) {
                result = (o1.length() - o2.length()) > 0 ? 1 : -1;
            }
            if (this.order == EnumListOrder.desc){
                result = -result;
            }
            return result;
        }
    }
}
