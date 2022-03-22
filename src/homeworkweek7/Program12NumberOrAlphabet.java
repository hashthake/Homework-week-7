package homeworkweek7;
/** Program about Number is Alphbet
 *  Or number
 *  or special character*/

import java.util.Scanner;

public class Program12NumberOrAlphabet {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any Character");
        char ch= scan.next().charAt(0);

        if((ch >='a' && ch <='z') || (ch>='A' && ch<='Z')){

            System.out.println(ch + " is a A Alphaber");

        }
        else if(ch>='0' && ch<='9'){
            System.out.println(ch + " is a Digit");
        }
        else{
            System.out.println(ch+ " is a Special Character");
        }


    }


}
