import java.lang.*;
import java.util.Scanner;
class Middle_number{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the first value A:");
             int a=sc.nextInt();
             System.out.println("enter the second value B:");
             int b=sc.nextInt();
	     System.out.println("enter the second value C:");
             int c=sc.nextInt();
             if(a>b){

                  if(b>c)
                  {
                      System.out.println("median is B");
                  }

             else if(a>c)
                  {
                   System.out.println("median is c");
                  }
             else
                {
                 System.out.println("median is a");

                 }
}
            else{

                if(b>=a)
                 {
                     if(a>c)
                 {
                     System.out.println("median is a");
                 }
                 else if(b>c)
                 {
                     System.out.println("median is c");
                 }
                 else
                 {
                   System.out.println("median is b");
                 }
             }
}


}}
