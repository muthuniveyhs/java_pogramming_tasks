import java.lang.*;
import java.util.Scanner;
class leap_year{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value of a :");
             int a=sc.nextInt();
             if(a%4==0)
             {  
                  System.out.println("It is a leap year");
             }
             else
              {
                  System.out.println("its not leap year");
              }

}
}