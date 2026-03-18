import java.lang.*;
import java.util.Scanner;
class salary{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the salary :");
             int salary=sc.nextInt();
             if(salary>=50000){
	     System.out.println("High income");
             }else if((salary>30000) && (salary<=49999)){
             System.out.println("Medium income"); 
             } 
             else{
             System.out.println("Low income"); 
            }
            
}} 
