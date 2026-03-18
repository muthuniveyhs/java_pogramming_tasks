import java.lang.*;
import java.util.Scanner;
class Division{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value of a :");
             int a=sc.nextInt();
             if(a%2==0)
             {  
                  System.out.println(a+"number ends with Zero");
             }
             else
              {
                  System.out.println(a+"Not ends with zero ");
              }

}
}