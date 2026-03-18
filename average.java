import java.lang.*;
import java.util.Scanner;
class average{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("a value is:");
             int a=sc.nextInt();
             System.out.println("b value is:");
             int b=sc.nextInt();
             System.out.println("c value is:");
	     int c=sc.nextInt();
             int average=(a+b+c)/3;
	     System.out.println("a value is:"+a);
             System.out.println("b value is:"+b);
             System.out.println("c value is:"+c);

             System.out.println("average of 3 numbers:"+average);
}}