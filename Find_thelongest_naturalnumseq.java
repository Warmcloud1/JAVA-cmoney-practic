import java.util.Scanner;

class Find_sub_len{
    int calc(int[] data,int start){
        int len=0;
        while(data[start++]>0){
            len++;
            if(start==data.length)
                break;
        }
        return len;
    }
}
        
public class Find_thelongest_naturalnumseq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Find_sub_len fsl=new Find_sub_len();
        int len=sc.nextInt(),start_i=0,end_i=0,seq_len=0,sum=0;
        int[] data=new int[len];
        for(int i=0;i<len;i++)
            data[i]=sc.nextInt();
        for(int i=0;i<len;){
            int seq_len_tmp=0;
            if(data[i]>0)
                seq_len_tmp=fsl.calc(data,i);
                                    
            if(seq_len_tmp>seq_len){
                seq_len=seq_len_tmp;
                start_i=i;
            }
            
            if(seq_len_tmp>0)
                i+=seq_len_tmp;
            else
                i+=1;            
        }
        
        if(seq_len==0)
            System.out.print(-1);
        else{
            while(seq_len-->0){
            sum+=data[start_i++];
            if(start_i==data.length||seq_len==0)
                System.out.print(sum);
            }
        }
    }    
}
