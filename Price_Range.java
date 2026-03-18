import java.lang.*;
import java.util.Scanner;
class Price_Range{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the product price :");
             int Price=sc.nextInt();
             if(Price>10000 && Price<=20000){
	     System.out.println("Premium Product");
              }           
             else if(Price>5000 && Price<=10000){
	     System.out.println("High Range");
             }
             else if(Price>3000 && Price<=5000){
	     System.out.println("Mid Range");
             }
             else if(Price>1000 && Price<=3000){
	     System.out.println("Budgt");
             }
             else {
             System.out.println("Cheap Product"); 
             }
            
}} 