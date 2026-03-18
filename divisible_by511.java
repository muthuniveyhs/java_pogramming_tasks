import java.lang.*;
import java.util.Scanner;
class Division{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value of a :");
             int a=sc.nextInt();
             if(a%5==0 && a%11==0)
             {
                  System.out.println("the number is divisible by both");
             }
             else if(a%5==0)
              {
                  System.out.println("the number is divisible by 5");
              }
              else if(a%11==0)
              {
                  System.out.println("the number is divisible by 11");
               }
              else
              {
                  System.out.println("not divisible by 5 or 11");
              }
  

}
}