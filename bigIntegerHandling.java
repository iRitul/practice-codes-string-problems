import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String a1 = scanner.nextLine();
        String b1 = scanner.nextLine();
        BigInteger a = new BigInteger(a1);
        BigInteger b = new BigInteger(b1);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
