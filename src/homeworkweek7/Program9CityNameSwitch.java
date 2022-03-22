package homeworkweek7;

import java.util.Scanner;

public class Program9CityNameSwitch {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter First letter Of City between A To F");

        char ch = name.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("City name is Ahmedabad");
                break;
            case 'A':
                System.out.println("Name of the City is : Ahmedabad");
                break;
            case 'b':
                System.out.println("Name of the City is : Bombay");
                break;
            case 'B':
                System.out.println("Name of the City is : Bombay");
                break;
            case 'c':
                System.out.println("Name of the City is : Chennai");
                break;
            case 'C':
                System.out.println("Name of the City is : Chennai");
                break;
            case 'd':
                System.out.println("Name of the City is : Delhi");
                break;
            case 'D':
                System.out.println("Name of the City is : Delhi");
                break;
            case 'e':
                System.out.println("Name of the City is : Etola");
                break;
            case 'E':
                System.out.println("Name of the City is : Etola");
                break;
            case 'f':
                System.out.println("Name of the City is : Faridabad");
                break;
            case 'F':
                System.out.println("Name of the City is : Faridabad");
                break;

            default:
                System.out.println("Invalid Entry");

        }
    }
}