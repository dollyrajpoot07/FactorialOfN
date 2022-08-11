// Find factorial of any number
//Input: 23
//Output: 25852016738884976640000

import java.math.BigInteger;
import java.util.*;

public class Factorial {
    public static BigInteger fac(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger result = fac(n);
        System.out.println(result);
        sc.close();
    }
}
