package 第八届蓝桥杯;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2018-03-19 23:19
 * description
 */
public class DataProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data1 = sc.next();
        String[] values = data1.split("/");
        int i1,i2,i3;
        i1 = Integer.valueOf(values[0]);
        i2 = Integer.valueOf(values[1]);
        i3 = Integer.valueOf(values[2]);
        System.out.println(i1+"   "+i2+"   "+i3);
    }
    public boolean volid(int year,int month ,int day){
        if (year>2059||year<1960)
            return false ;
        return  false;
    }
}
