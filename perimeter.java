import java.lang.*;
import java.util.Scanner;
class perimeter{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("l value is:");
             int l=sc.nextInt();
             System.out.println("w value is:");
             int w=sc.nextInt();
	     double perimeter=2*(l*w);
	     System.out.println("l value is:"+l);
             System.out.println("w value is:"+w);
             System.out.println("perimeter of a rectangle is:"+perimeter);
}}