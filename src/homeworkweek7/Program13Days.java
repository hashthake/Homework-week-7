package homeworkweek7;

import java.util.Scanner;

public class Program13Days {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner d = new Scanner(System.in);
        int Day = d.nextInt();


        switch (Day){

            case 1:
                System.out.println(("Monday"));
                break;
            case 2:
                System.out.println(("Tuesday"));
                break;
            case 3:
                System.out.println(("Wednesday"));
                break;
            case 4:
                System.out.println(("Thursday"));
                break;
            case 5:
                System.out.println(("Friday"));
                break;
            case 6:
                System.out.println(("Saturday"));
                break;
            case 7:
                System.out.println(("Saturday"));
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }

    }


}
