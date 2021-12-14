import java.util.Scanner;
/*Tips:Can't use array*/

class PrimeFactorization{
    boolean isprime(int num){
        boolean p=true;        
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                p=false;
                break;
            }
        }        
        return p;
    }
    
    int prime_times(int num,int prime){
        int times=0;
        while(num%prime==0){
            num/=prime;
            times++;
        } 
        return times;
    }  
    
    int prime_pow(int prime,int times){
        int pow=1;
        while(times-->0)
            pow*=prime;
        return pow;
    }
    
}

class Gcd{
    int gcd(int numa,int numb){
        while(numa%numb!=0){
            int tmp=numa%numb;
            numa=numb;
            numb=tmp;
        }
        return numb;
    }        
}
        
public class FindSequenceGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Gcd G=new Gcd();
        PrimeFactorization Pf=new PrimeFactorization();
        int num,ans_gcd=0;                
        while(true){       
            num=sc.nextInt();
            if(num==-1)break;
            ans_gcd=G.gcd(ans_gcd,num);            
        } 
        String output=ans_gcd+"=1^1";
        while(ans_gcd>1){
            for(int i=2;i<=ans_gcd/2;i++){
                int times=Pf.prime_times(ans_gcd,i);
                if(Pf.isprime(i)&&times>0){
                    output+="*"+i+"^"+times;
                    ans_gcd/=Pf.prime_pow(i,times);
                }
            }
        }
        System.out.println(output);
    }    
}
