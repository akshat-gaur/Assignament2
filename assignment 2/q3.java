import java.util.Scanner;

class Q3 {
    public static void main(String args[]) {
        int month;
        Scanner obj = new Scanner(System.in);
        month = obj.nextInt();

        switch (month) {
            case 1:
                System.out.println("januvary");
                System.out.println(31);
                break;
            case 2:
                System.out.println("febvury");
                System.out.println(28);
                break;
            case 3:
                System.out.println("March");
                System.out.println(31);
                break;
            case 4:
                System.out.println("April");
                System.out.println(30);
                break;
            case 5:
                System.out.println("May");
                System.out.println(31);
                break;
            case 6:
                System.out.println("June");
                System.out.println(30);
                break;
            case 7:
                System.out.println("July");
                System.out.println(31);
                break;
            case 8:
                System.out.println("Augest");
                System.out.println(31);
                break;
            case 9:
                System.out.println("September");
                System.out.println(30);
                break;
            case 10:
                System.out.println("October");
                System.out.println(31);
                break;
            case 11:
                System.out.println("Nov");
                System.out.println(30);
                break;
            case 12:
                System.out.println("December");
                System.out.println(31);
                break;
            default:
                System.out.println("Wrong input");
        }

    }

}