import java.lang.*;
import java.util.Scanner;
class payment{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter  your amount:");
             int amount=sc.nextInt();
             System.out.println("enter your password:");
             String password=sc.next();
             if(amount==(12000)){
              

                  if(password.equals("12234"))
                  {
                      System.out.println("generate receipt");
                  }

             else 
                  {
                   System.out.println("payment failed ");
                  }
           }
            else{
                System.out.println("invalid payment");

               }



}}