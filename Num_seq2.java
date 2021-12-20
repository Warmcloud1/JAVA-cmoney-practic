import java.util.Scanner;

class Num_judge{
    void calc(int[] data){
        boolean b=true;
        int[] tmp=new int[data.length-1];
        int diff_1,diff_2;
        
        for(int i=0;i<tmp.length;i++){
            tmp[i]=data[i+1]-data[i];
        }  
        
        diff_1=tmp[1]-tmp[0];
        for(int i=2;i<tmp.length;i++){
            diff_2=tmp[i]-tmp[i-1];
            if(diff_2!=diff_1){
                b=false;
                break;
            }
        }
        if(b)
            System.out.print("true");
        else
            System.out.print("false");
    }
}

public class Num_seq2 {  
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);     
       Num_judge nj=new Num_judge();
       int len=sc.nextInt(),index=0;
       int[] data=new int[len];   
       while(len-->0){
           data[index++]=sc.nextInt();       
       }
       nj.calc(data);
    }    
}
