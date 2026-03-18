import java.lang.*;
import java.util.Scanner;
class palindrom{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             for(int i=151;i<=156;i++){
                int n=i;
    
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
}