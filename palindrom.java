import java.lang.*;
import java.util.Scanner;
class palin{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
    int n=121;
    int b=n;
    int rev=0;
    while(n>0){
        int digit=n%10;
        System.out.println("digit"+digit);
        rev=((rev*10)+digit);
        n=(n/10);
        
    }
    
    if(rev==b){
        System.out.println("palindrome");
    }else{
        System.out.println("not a palindrome");
    }
    System.out.println(rev);
}}