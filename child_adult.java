import java.lang.*;
import java.util.Scanner;
class child_adult{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
       
        System.out.println("the age is equal?"+((age>=18)?"adult":"child"));
}
}
          