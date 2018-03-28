package 第八届蓝桥杯;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2018-03-28 22:21
 * description 2017年蓝桥杯凑包子问题
 */
public class SteamedStuffedBun {
    public static void main(String[] args) {
        int[] s= new int[]{4,5};
        System.out.println(isSolve(9,s,2));

    }

    public static boolean isSolve(int k, int[] s,int len) {
        if (k==0)
            return true;
        Arrays.sort(s);
        for (int i = len-1; i >=0 ; i--){
            System.out.println(k);
            return isSolve(k%s[i],s,len-1);
        }

            return false;
    }
}
