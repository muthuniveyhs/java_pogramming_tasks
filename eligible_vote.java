import java.lang.*;
import java.util.Scanner;
class eligible_vote{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
       
        System.out.println("you are "+((age>=18)?"eligible for vote":"not eligible"));
}
}