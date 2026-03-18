import java.lang.*;
import java.util.Scanner;
class license{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter  your age:");
             int age=sc.nextInt();
             
             //String eye="pass";
             
             if(age>=18){

                System.out.println("you are eligible for license");
                System.out.println("enter your eye test resulte:");
                String eye=sc.next();

                  if(eye.equals("pass"))
                  {
                      System.out.println("license approved");
                  }

             else 
                  {
                   System.out.println("license cencled you did not clear the eye test");
                  }
           }
            else{
                System.out.println("your not eligible");

               }



}}