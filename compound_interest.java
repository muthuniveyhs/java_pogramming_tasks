import java.lang.*;
import java.util.Scanner;
class compound_interest{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("p value is:");
             int p=sc.nextInt();
             System.out.println("r value is:");
             double r=sc.nextDouble();
             System.out.println("t value is:");
             int t=sc.nextInt();
	     double A=p+(p*r/100);
	     System.out.println("p value is:"+p);
             System.out.println("r value is:"+r);
             System.out.println("t value is:"+t);
             System.out.println("compound_interest value is:"+A);

}}