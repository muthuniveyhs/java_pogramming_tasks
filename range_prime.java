class Prime{
    public static void main(String [] args){
        
        for(int j=1; j<=100; j++){

        int n=j;
        int count=0;

        for(int i=2; i<n; i++){
            if(n%i==0){
                count++;
                break;
            }
        }

        if(count==0){
            System.out.println(n + " is a Prime Number");
        }
        else{
            System.out.println(n + " is not a Prime Number");
        }
        }

    }
}