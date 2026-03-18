import java.lang.*;
import java.util.Scanner;
class Division{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value of a :");
             int a=sc.nextInt();
             if(a%3==0)
             {  
                  System.out.println("FIZZ");
             }
             else
              {
                  System.out.println("Not FIZZ");
              }

}
}