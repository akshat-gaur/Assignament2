import java.util.Scanner;

class q1 {
    public static void main(String args[]) {
        double a;
        Scanner obj = new Scanner(System.in);
        a = obj.nextDouble(); // Take input from the user

        if (80 <= a && a <= 90) {
            a = a + 5; // add 5 if a is between 80 and 90
        }
        System.out.println(a);

    }
}