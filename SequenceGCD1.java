import java.util.Scanner;

class Calc_func{
    int gcd(int numa,int numb){
        while(numa%numb!=0){
            int tmp=numa%numb;
            numa=numb;
            numb=tmp;
        }
        return numb;
    }         
}

public class SequenceGCD2 {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calc_func cf=new Calc_func();
        int data,gcd=0;        
        while(true){
            data=sc.nextInt();
            if(data==-1) break;
            gcd=cf.gcd(gcd,data);            
        }     
        
        String output="";
        
        if(gcd>0){
            output+=gcd+"=1^1";
            int tmp=gcd;
            for(int i=2;i<=tmp/2;i++){                
                if(gcd%i!=0) continue;                
                int times=0;
                while(gcd%i==0){
                    times++;
                    gcd/=i;
                }// get pow times
                output+="*"+i+"^"+times;
                if(gcd==1)break;
                
            }            
        }
        System.out.println(output);
    }        
}    

