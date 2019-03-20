package the2016;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2018-03-31 23:13
 * description
 */
public class Seven {

    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        int n = sca.nextInt();
        int maxn = (int) Math.sqrt(n);
        boolean flag = true;
        for(int a = 0; a <= maxn && flag; ++a){
            for(int b = a; b <= maxn && flag; ++b){
                for(int c = b; c <= maxn && flag; ++c){
                    int d = (int) Math.sqrt(n-a*a-b*b-c*c);
                    if(n == a*a+b*b+c*c+d*d){
                        System.out.println(a+" "+b+" "+c+" "+d);
                       return;

                    }
                }
            }
        }
    }
}
