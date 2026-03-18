import java.lang.*;
import java.util.Scanner;
class job_interview{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter your written test results:");
             String test=sc.next();
            
             
             if(test.equals("pass")){

             System.out.println("you are passed the written test");
             System.out.println("enter your technical interview results:");
             String technical=sc.next();
                     

                  if(technical.equals("pass"))
                  {
                      System.out.println("eligible for hr interview");
                  }

             else 
                  {
                   System.out.println("rejected");
                  }
           }
            else{
                System.out.println("you are not eligible");

               }



}}