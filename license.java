import java.lang.*;
import java.util.Scanner;
class license{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the age :");
             int age=sc.nextInt();
             if(age>=18)
             {

	             System.out.println("Eye test");
             }
             if(age>=18)
             {
                     System.out.println("license approved");
             }
             else
             {
                   System.out.println("rejected due to age");
             }
            
}} 