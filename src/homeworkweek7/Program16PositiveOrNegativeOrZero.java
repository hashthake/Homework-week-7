package homeworkweek7;

import java.util.Scanner;

public class Program16PositiveOrNegativeOrZero {

    public static void main(String[] args) {
        System.out.println("Please Enter Number : ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        if(num>0){
        System.out.println("Entered number is Positive");}
        else if(num<0){
            System.out.println("Entered number is Negative");}
            else {
                System.out.println("Entered number is Zero");
            }

        }

    }


