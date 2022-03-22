package homeworkweek7;

/* This is a program to find out entered number is odd or even */

import java.util.Scanner;

public class Program6OddEven {

    public static void main(String[] args) {

        int num;
        System.out.println("Please Enter Number");
        Scanner ref = new Scanner(System.in);
        num = ref.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }


}
