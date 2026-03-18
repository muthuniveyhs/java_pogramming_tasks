import java.lang.*;
import java.util.Scanner;
class age{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the age :");
             int age=sc.nextInt();
             if(age>1&&age<=13){
	         System.out.println("child ");
             }
             else if(age>13&&age<=19)
             {
                 System.out.println("teenage"); 
             }
             else if(age>20&&age<=59)
             {
                 System.out.println("adult");
             }
             
             else{
                  System.out.println("senior citizen");
             }          
            
}} 