package homeworkweek7;
/* Program to find out year is leap year or not*/

import java.util.Scanner;

public class Program2LeapYear {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Please Enter Year : ");

        int year = l.nextInt();
        boolean leap = false;

        if(year % 4 ==0){
            if(year % 100 ==0);
            if(year % 400 ==0);
            leap=true;



        }

        else leap=false;
        if(leap){
            System.out.println(year + " is a leap year");
        }
        else
            System.out.println(year + " is not a leap year");


    }






}
