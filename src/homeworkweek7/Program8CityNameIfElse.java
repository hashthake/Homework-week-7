package homeworkweek7;

import java.util.Scanner;

/* Program to output city name */
public class Program8CityNameIfElse {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter First letter Of City between A To F");

        char ch = name.next().charAt(0);

        if((ch == 'a')||(ch == 'A')) {
            System.out.println("Ahmedabad");
        }
            else if ((ch == 'b')||(ch == 'B')){
            System.out.println("Bombay");
            }
            else if ((ch == 'c')||(ch == 'C')) {
            System.out.println("Chennai");
        }
            else if ((ch == 'd')||(ch == 'D')) {
            System.out.println("Delhi");
        }
            else if ((ch == 'e')||(ch == 'E')) {
            System.out.println("Etola");
        }
            else if ((ch == 'f')||(ch == 'F')) {
            System.out.println("Faridabad");
        }
            else{
            System.out.println("Invalid Entry");

        }



    }



}
