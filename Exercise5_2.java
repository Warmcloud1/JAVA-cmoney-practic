import java.util.Scanner;

public class Exercise5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int C=sc.nextInt(),G=sc.nextInt(),N,b_sta=1000,tmp,d=1,d_total=0;
        while(true){            
            N=sc.nextInt();
            if(N==-1) 
                break;
            if(d%2==0) 
                C-=20;            
            tmp=b_sta;
            for(int i=0;i<N;i++){
                if(tmp-C>=0){
                    d_total+=C;
                    tmp-=C;
                }
                else 
                    break;
            }            
            d_total/=100;
            b_sta+=d_total*G;
            d++;
        }
        System.out.print(b_sta);
    }    
}
