import java.lang.*;
import java.util.Scanner;
class bmi{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value for weight is: ");
             int weight=sc.nextInt();
             System.out.println("enter the value for height :");
	     int height=sc.nextInt();
             int bmi=weight/(height*height);
	     System.out.println("enter the value for weight is: "+weight);
             System.out.println("enter the value for height :"+height);
             System.out.println("calculate the body mass index :"+bmi);

            
}}