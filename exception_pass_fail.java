import java.lang.*;
import java.util.Scanner;
class InvalidFailException extends Exception{
    InvalidFailException(String message){
        super(message);
    }
}
class marks{
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the a value");
            int mark=sc.nextInt();
            if(mark>35){
            System.out.println("pass");
            }
            else{
            throw new InvalidFailException("fail");
            }
        }
        catch(InvalidFailException e){
            System.out.println("Error "+e);
        }
    }
}