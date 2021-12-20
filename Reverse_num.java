import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        boolean negative=false;
        int n=sc.nextInt();
        if(n<0){
            negative=true;
            n*=-1;
        }
        long n_long=0;        
        while(n!=0){
            n_long*=10;
            n_long+=n%10;
            n/=10;
        }
        if(negative) 
            n_long*=-1;
        
        if(n_long>=Integer.MIN_VALUE&&n_long<=Integer.MAX_VALUE)
            System.out.print(n_long);
        else
            System.out.print("Integer Overflow");    
    }
}
