import java.lang.*;
import java.util.Scanner;
class mark{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the mark :");
             int mark=sc.nextInt();
             if(mark>90&&mark<=100){
	         System.out.println("grade A ");
             }
             else if(mark>80&&mark<=90)
             {
                 System.out.println("grade B"); 
             }
             else if(mark>80&&mark<=70)
             {
                 System.out.println("grade c");
             }
             else if(mark>70&&mark>=0)
             {
                 System.out.println("grade d");
             }
             else{
                  System.out.println("invalid input");
             }          
            
}} 