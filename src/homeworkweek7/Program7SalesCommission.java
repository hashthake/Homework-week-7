package homeworkweek7;

import java.util.Scanner;

public class Program7SalesCommission {
    public static void main(String[] args) {

       int salesid;
       String sellername;
       float salesamount;
       float salarybasic;

        Scanner h = new Scanner(System.in);
        System.out.println("Enter sales id number ");
        salesid = h.nextInt();
        System.out.println("Enter seller name");
        sellername = h.next();
        System.out.println("Enter Sales Amout");
        salesamount = h.nextFloat();
        System.out.println("Enter Basic Salary");
        salarybasic = h.nextFloat();

        if(salesamount>=50000){
            System.out.println("Your Commission is : " + salesamount*35/100);}
            else if(salesamount>=30000 && salesamount<50000){
            System.out.println("Your Commission is : " + salesamount*20/100);
            }
            else if(salesamount>=20000 && salesamount<30000){
            System.out.println("Your Commission is : " + salesamount*10/100); }
            else  if (salesamount>=10000 && salesamount<20000){
            System.out.println("Your Commission is : " + salesamount*5/100);

        }
            else{
            System.out.println("Your Commission is : " + salesamount*2/100);

        }
        }




    }




