import java.lang.*;
import java.util.Scanner;
class Grade_Lettermap{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the mark :");
             int mark=sc.nextInt();
             if(mark>90&&mark<=100){
	         System.out.println("grade A ");
             }
             else if(mark>90 && mark<=100)
             {
                 System.out.println("A"); 
             }
             else if(mark>80 && mark<=90)
             {
                 System.out.println("A");
             }
             else if(mark>70 && mark<=80)
             {
                 System.out.println("B");
             }
             else if(mark>60 && mark<=70)
             {
                 System.out.println("C");
             }
             else if(mark>50 && mark<=60)
             {
                 System.out.println("D");
             }
             else{
                  System.out.println("F");
             }          
            
}} 