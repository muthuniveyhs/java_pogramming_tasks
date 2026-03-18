import java.lang.*;
import java.util.Scanner;

class Simple_interest{
    public void Si(int p,int t,int r ){
        int si=(p*r*t)/100;
        System.out.println("Simple Interest:"+si);
    }

      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
        System.out.println("enter a value for principal:");
        int p=sc.nextInt();
        System.out.println("enter the value for rate of interest :");
        int r=sc.nextInt();
        System.out.println("enter the value for time :");
        int t=sc.nextInt();
        Simple_interest c =new Simple_interest();
        c.Si(p,r,t);

    
    }
 
}