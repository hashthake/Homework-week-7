package homeworkweek7;

import java.util.Scanner;

public class Program11DividedBy3And5 {
    public static void main(String[] args) {
        System.out.println("\nDivided by 3: ");

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");

        }
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");


        }


    }
}
