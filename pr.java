import java.lang.*;
class prime{
    public static void main(String args[]){
        //Scanner obj=new Scanner(System.in);
        int c=0;
        int n=10;
        for(int i=2;i<n;i++){
            if(n%2==0){
                c++;
                break;
            }
            if(c==0){
                System.out.println("prime no");
            }
            else{
                System.out.println("not a prime no");
            }
        }
        
    }
    }
