package homeworkweek7;
/* Program to find odd or even with use of ternary operator*/
import java.util.Scanner;

public class Program1TernaryOperator {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");

        int num = scanner.nextInt();

        String result = num%2==0 ? "Even" : "odd";

        System.out.println(num + " is " + result);





    }



}
