import java.lang.*;
import java.util.Scanner;
class palin{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);                     
             System.out.println("enter the size of array");
             int size=sc.nextInt();
             int a[]=new int[size];
    for(int i=0;i<size;i++){
         a[i]=sc.nextInt();
         int n=a[i];
        int b=n;
        int rev=0;
        while(n>0){                                                                                                                                                                                                                                                     
            int digit=n%10;
            System.out.println("digit"+digit);
            rev=((rev*10)+digit);
            n=(n/10);
            
        }
        
        if(rev==b){
            System.out.println(b+"palindrome");
        }else{
            System.out.println(b+"not a palindrome");
        }
        //System.out.println(rev);
    }}
}