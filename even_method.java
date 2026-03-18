import java.lang.*;
import java.util.Scanner;

class Even{
    public void even(int a){
        if(a%2==0){
            System.out.println(a+"Even");
        }
        else{
            System.out.println(a+"not a Even");
        }
        

    }

      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
        System.out.println("enter a value :");
        int a=sc.nextInt();
        Even l=new Even();
        l.even(a); 

    
    }
 
}