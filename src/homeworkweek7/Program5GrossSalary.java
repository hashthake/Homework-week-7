package homeworkweek7;

import java.util.Scanner;

public class Program5GrossSalary {


    public static void main(String[] args) {
        int a;
        double b;
        String name;
        double c;
        double d;
        double e;
        double f;
        double g;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee Id Number");
        a = scan.nextInt();
        System.out.println("Enter Employee Name");
        name = scan.next();
        System.out.println("Enter Employee Basic Salary");
        b = scan.nextDouble();

        c = (b * 10 / 100);
        d = (b * 8 / 100);
        e = (b * 9 / 100);
        f = (b * 20 / 100);
        g = (b + c + d + e - f);


        System.out.println(     "_________________________________"     );
        System.out.println(     "|        Salary Slip            |"     );
        System.out.println(     "|_______________________________|"     );
        System.out.println(     "|Emplyee Id      :" + a +      "|"     );
        System.out.println(     "|Emplyee N       :" + name + "  |"     );
        System.out.println(     "|_______________________________|"     );
        System.out.println(     "|Basic Salary    :" + b + "     |"     );
        System.out.println(     "|HRA 10%         :" + c + "     |"     );
        System.out.println(     "|TA 8%           :" + d + "     |"     );
        System.out.println(     "|DA 9%           :" + e + "     |"     );
        System.out.println(     "|PF -20%         :" + f + "     |      ");
        System.out.println(     "|_______________________________|      ");
        System.out.println(     "|Gross Salary    : " + g + "    |      ");
        System.out.println(     "|===============================|      ");


    }


}
