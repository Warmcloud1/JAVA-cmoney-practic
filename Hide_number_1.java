import java.util.Scanner;

class Judge_one{
    boolean calc(int num){        
        boolean isone=false;        
        if(num==1) isone=true;
        else{            
            int check=1;
            while(check<=num){
                check*=10;
            }
            check/=10;
            
            while(num>0){
                if(num/check==1){
                    isone=true;
                    break;       
                }
                else{
                    num%=check;
                    check/=10;
                }
            }
        }
        return isone;
    }
}


public class Hide_number_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Judge_one jo=new Judge_one();        
        int max=sc.nextInt();
        
        for(int i=0;i<=max;i++){
            if(!jo.calc(i))               
                System.out.print(i+" ");
        }
    }    
}
