import java.util.Scanner;

class Seq_func{
    long calc(long data){
        int times=0;
        long pow=1,tmp_digit=0;
        long result=0;
        while(data>0){           
            tmp_digit=data%10;
            result+=tmp_digit*pow;            
            times++;
            pow*=10;
            data/=10;
            while(true){                
                if(data==0){
                    result+=times*pow;
                    break;
                }
                else if(data%10==tmp_digit){
                    times++;
                    data/=10;
                }
                else{
                    result+=times*pow;
                    times=0;
                    pow*=10;
                    break;
                }
            }
        }        
        return result;
    }
}

public class Speacial_seq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Seq_func sf=new Seq_func();
        int target=sc.nextInt();
        long[] data=new long[target];
        for(int i=0;i<target;i++){
            if(i==0){
                data[i]=1;
            }
            else{                
                data[i]=sf.calc(data[i-1]);
            }            
        }
        System.out.print(data[target-1]);
    }
}
