// int 和 long混用時 要特別注意 int 會overflow的問題 尤其是數字小並不會發現!!


import java.util.Scanner;

class Spec_seq{
    long calc(int target){
        int times=0;
        long result=0,tmp_r=0,tmp_d,pow=1;
        for(int i=1;i<=target;i++){            
            if(i==1)
                result=1;
            else{
                tmp_r=result;
                result=0;
                pow=1;              
                
                while(tmp_r>0){                    
                    tmp_d=tmp_r%10;
                    result=result+(tmp_d*pow);
                    pow*=10;
                    tmp_r/=10;
                    times++;
                    while(tmp_r%10==tmp_d){
                        times++;
                        tmp_r/=10;
                    }
                    result=result+(times*pow);
                    pow*=10;
                    times=0;                   
                }
            }
        } 
        return result;
    }        
        
}


public class Special_seq2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Spec_seq s=new Spec_seq();
        int target=sc.nextInt();
        long result=s.calc(target);
        System.out.print(result);
    }    
}
