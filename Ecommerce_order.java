import java.lang.*;
import java.util.Scanner;
class order_system{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the product:");
             int product=sc.nextInt();
            
             if(product>0){
                   System.out.println("product instock ");
                  System.out.println("enter the payment amount:");
                 int payment=sc.nextInt();
              

                  if(payment>0)
                  {
                      
                      System.out.println("confirm order ");
                    }                         

             else 
                  {
                   System.out.println("check payment ");
                  }
           }
            else{
                System.out.println("out of stock");

               }


}}