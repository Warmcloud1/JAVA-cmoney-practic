import java.util.Scanner;

class Seq_judge{
    boolean sj(int[] data){
        boolean b=true;
        if(data.length>=3){
            
            int n1=data[0],n2=data[1];
            for(int i=2;i<data.length;i++){
                if(data[i]!=n1*n2){
                    b=false;
                    break;
                }                
                n1=n2;
                n2=data[i];
            }            
        }
        else
            b=false;
        return b;
    }
}
        
public class Num_seq {   
    public static void main(String[] args) {       
        Seq_judge seq=new Seq_judge();
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt(),index=0;
        int[] data=new int[len];
        while(len--!=0)
            data[index++]=sc.nextInt();
        if(seq.sj(data))
            System.out.println(true);
        else
            System.out.println(false);
    }    
}
