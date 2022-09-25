import java.util.Scanner;
import static java.lang.Math.*;

class Q5 {
    public static void main(String args[]) {
        int n;
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt(); // Take input from the user

        System.out.print("n^1");
        System.out.print(" ");
        System.out.print("n^2"); // to print n^1 n^2 n^3 n^4
        System.out.print(" ");
        System.out.print("n^3");
        System.out.print(" ");
        System.out.print("n^4");
        System.out.println("");

        int i = 1;
        while (i <= n) { // iterator to iterate from one to n
            print_powers(i);
            i = i + 1;
        }
    }

    public static void print_powers(int n) { // funtion to print all 4 powers of a given number
        int i = 0;
        while (i <= 4) {
            int a = (int) pow(n, i);
            System.out.print(a);
            System.out.print(" ");
            i = i + 1;
        }
        System.out.println("");
    }

}