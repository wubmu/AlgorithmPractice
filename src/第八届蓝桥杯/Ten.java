package 第八届蓝桥杯;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2018-03-31 22:43
 * description
 */
public class Ten {
    static int a[]  = new int[100000];
    static long dp[] = new long[100000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k,i,j,sum;
        n=sc.nextInt();
        k = sc.nextInt();
        dp[0] = 0;
        sum = 0;
        for (i = 1; i <=n ; i++ ){
            a[i] = sc.nextInt();
            dp[i] = dp[i-1]+a[i];
           // System.out.println(dp[i]);
        }
        for (i=n;i>=0;i--)
            for (j=0;j<i;j++)
                if ((dp[i]-dp[j])%k==0)
                    sum++;

        System.out.println(sum);
    }

}
