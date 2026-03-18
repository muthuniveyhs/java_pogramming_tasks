import java.lang.*;
import java.util.Scanner;
class equal{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value of a :");
             int a=sc.nextInt();
             System.out.println("enter the value of b :");
             int b=sc.nextInt();
             System.out.println("enter the value of c :");
             int c=sc.nextInt();
             if((a==b) && (b==c))
             {
                  System.out.println("all are equal");
             }
             else if((a==b )&& (b==a))
              {
                  System.out.println("Two numbers are equal");
              }
              
              else
              {
                  System.out.println("All are different");
              }
  

}
}