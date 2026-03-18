import java.lang.*;
import java.util.Scanner;
class age{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the age :");
             int age=sc.nextInt();
             if(age>1&&age<=10){
	         System.out.println("child ");
             }
             else if(age>10&&age<=18)
             {
                 System.out.println("teenage"); 
             }
             else if(age>18&&age<=45)
             {
                 System.out.println("adult");
             }
             else if(age>45&&age<=100)
             {
                 System.out.println("old");
             }
             else{
                  System.out.println("invalid input");
             }          
            
}} 