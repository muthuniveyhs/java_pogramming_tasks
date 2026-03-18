import java.lang.*;
import java.util.Scanner;

class Main{
    int add(int i,int k){
        return i+k;
    }
    int sub(int i,int k){
        return i-k;
    }
    int mul(int i,int k){
        return i*k;
    }
    int div(int i,int k){
        return i/k;
    }

      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int n=1;
            while(n<=1){
        System.out.println("enter a value :");
        int a=sc.nextInt();
        System.out.println("enter the value :");
        int b=sc.nextInt();
        Main l=new Main();
        //l.add(a,b); 
        System.out.println("press 1 for add\npress 2 for sub\npress 3 for mul\npress 4 for div\npress 5 for exit\n");
        System.out.println("enter your choice");
        int wish=sc.nextInt();
        switch(wish)
        {
            case 1:
            {
                System.out.println(l.add(a,b));
                break;
            }
            case 2:
            {
                System.out.println(l.sub(a,b));
                break;
            }
            case 3:
            {
                System.out.println(l.mul(a,b));
                break;
            }
            case 4:
            {
                System.out.println(l.div(a,b));
                break;
         
           }
           case 5:
           {
               n++;
               break;
           }
           default:{
          
                System.out.println("invalind input ");
            
           }
        }
            }
    
    }
 
}