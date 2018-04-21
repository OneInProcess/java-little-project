package c08.h01;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class C08DataUtil {
    /**
     * detail.txt�ļ���һ�����еĹ���СƱ ÿ�б�ʾһ�ι��ÿ����Ʒ֮���ð�Ƕ��ŷֿ� ���ҳ� ���� ������Ʒ�ܱ�ͬʱ ����"
     * ����������Ʒ�����ö��ŷָ� ����
     * Ҳ���������µķ���,���������µ���
     *
     * @param detailFileName ����СƱ���ļ���
     * @return
     */
    public String getFrequentItem(String detailFileName) throws Exception {
        //��ʾ
        //1  ��LineNumberReader ����ÿ��(���ļ��� ����FileReader,��FileReader����LineNumberReader)
        //2  ��ÿ���� ��,�� ���
        //3 ��ÿ����Ԫ�� ����Ϊһ��  ��¼ÿ�Գ��ִ��� (����map���� ) ��Ҫ����  ��ơ��ը��" �� ��ը��ơ��" �ǵȼ۵�
        //4 ȡ���
        //���������µ��࣬Ҳ���������µķ���

        FileReader reader = new FileReader(detailFileName);
        LineNumberReader linereader = new LineNumberReader(reader);
        String lines[] = new String[100];
        int j = 1, i = 1, k = 1, l = 1, m = 1, n = 1;
        for (j = 1; j < 100; j++) {
            lines[j] = linereader.readLine();
            if (lines[j] == null) {
                i = j - 1;
                break;
            }
            //System.out.println(lines[j]);
        }
        int num[] = new int[j];
        for (l = 1; l < j; l++) {
            num[l] = 0;
            for (k = 0; k < lines[l].length(); k++) {
                if (lines[l].charAt(k) == ',') {
                    num[l] = num[l] + 1;
                }
            }
            num[l] = num[l] + 1;
            //System.out.println(num[l]);
        }
        String in[][] = new String[j][100];
        for (i = 1; i < j; i++) {
            for (n = 1; n < 100; n++) {
                in[i][n] = "";
            }
        }
        for (l = 1; l < j; l++) {
            m = 1;
            for (k = 0; k < lines[l].length(); k++) {
                if (lines[l].charAt(k) != ',') {
                    in[l][m] = in[l][m] + lines[l].charAt(k);

                } else {
                    m = m + 1;
                }
            }
            //System.out.println(in[l][2]);

        }

        int z = 1, x = 1, c = 1;
        String ex = "";

        for (z = 1; z < j; z++) {
            for (x = 1; x < num[z]; x++) {
                if (in[z][x].compareTo(in[z][x + 1]) > 0) {
                    ex = in[z][x];
                    in[z][x] = in[z][x + 1];
                    in[z][x + 1] = ex;


                }
            }
        }

//		for(z=1;z<j;z++){
//			Arrays.sort(in[z]);
//		}
        String po[][][] = new String[j][50][50];
        for (z = 1; z < j; z++) {
            for (x = 1; x < num[z]; x++) {
                for (c = x + 1; c < num[z] + 1; c++) {
                    po[z][x][c] = in[z][x] + in[z][c];
                }
            }
        }
        //System.out.print(po[1][1][3]);
        String fina = "";
        int fin[][][] = new int[j][50][50];
        int len[][][] = new int[j][50][50];
        for (z = 1; z < j; z++) {
            for (x = 1; x < num[z]; x++) {
                for (c = x + 1; c < num[z] + 1; c++) {
                    fin[z][x][c] = 1;
                    fina = fina + po[z][x][c];
                    len[z][x][c] = po[z][x][c].length();
                }
            }
        }
        int leng = fina.length(), v = 1;
        for (z = 1; z < j; z++) {
            for (x = 1; x < num[z]; x++) {
                for (c = x + 1; c < num[z] + 1; c++) {
                    for (v = 0; v < (leng - len[z][x][c]); v++) {
                        if (po[z][x][c].equals(fina.substring(v, v + len[z][x][c]))) {
                            fin[z][x][c] = fin[z][x][c] + 1;
                        }
                    }
                }
            }
        }
        int ab = 1;
        for (z = 1; z < j; z++) {
            for (x = 1; x < num[z]; x++) {
                for (c = x + 1; c < num[z] + 1; c++) {
                    if (ab < fin[z][x][c]) {
                        ab = fin[z][x][c];
                    }

                }
            }
        }
        int qw = 1, op = 1, er = 1;
        for (z = 1; z < j; z++) {
            for (x = 1; x < num[z]; x++) {
                for (c = x + 1; c < num[z] + 1; c++) {
                    if (fin[z][x][c] == ab) {
                        op = z;
                        qw = x;
                        er = c;
                        break;
                    }
                }
            }
        }


        return in[op][qw] + "," + in[op][er];
    }

}
