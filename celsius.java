import java.lang.*;
import java.util.Scanner;
class celsius{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Celsius : " );
             int f= sc.nextInt();

	     double c=(f-32)*5/9;
	     System.out.println("Celsius : " + c);
}} 
 