import java.lang.*;
import java.util.Scanner;
class compound{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in); 
             System.out.println("p value is:");

             int p=sc.nextInt();
             System.out.println("r value is:");
 
             int r=sc.nextInt();
	     double ci=p+(p*r/100);
	     System.out.println("p value is:"+p);
             System.out.println("r value is:"+r);
             System.out.println("compound_formula:"+ci);
}}