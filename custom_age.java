import java.lang.*;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
class Age{
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the a value");
            int age=sc.nextInt();
            if(age>18){
            System.out.println("eligible");
            }
            else{
            throw new InvalidAgeException("not eligible");
            }
        }
        catch(InvalidAgeException e){
            System.out.println("Error "+e);
        }
    }
}