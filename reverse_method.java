import java.lang.*;
import java.util.Scanner;

class Reverse{
    public void rev(int a){
     
        int n=a;
        int rev=0;
        while(n>0){
          int rem=n%10;
          rev=((rev*10)+rem);
          n=n/10;
        }
           System.out.println("rev"+rev);
        }
        
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
        System.out.println("enter a value :");
        int a=sc.nextInt();
        Reverse l=new Reverse();
        l.rev(a); 

    
    }
 
}