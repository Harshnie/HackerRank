import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class PalindromeCheck {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); // correctly declared Scanner

        String a = scan.nextLine();
        String b = scan.nextLine();

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        BigInteger sum = A.add(B);
        BigInteger product = A.multiply(B);

        System.out.println(sum);
        System.out.println(product);

        scan.close();
    }
}
