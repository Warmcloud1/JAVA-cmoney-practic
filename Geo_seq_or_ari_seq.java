import java.util.Scanner;

class Ari_seq{        
    boolean calc(int[] data){
        boolean result=true;
        int diff=data[1]-data[0];
        for(int i=2;i<data.length;i++){
            if(data[i]-data[i-1]!=diff){
                result=false;
                break;
            }
        }
        return result;
    }
}

class Geo_seq{
    boolean calc(int[] data){
        boolean result=true;
        int ratio=data[1]/data[0];
        for(int i=2;i<data.length;i++){
            if(data[i]/data[i-1]!=ratio){
                result=false;
                break;
            }
        }
        return result;
    }
}

public class Geo_seq_or_ari_seq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Geo_seq gs=new Geo_seq();
        Ari_seq as=new Ari_seq();
        int len=4,index=0,answer=-1;        
        int[] data=new int[len];
        while(len-->0)
            data[index++]=sc.nextInt();        
        if(as.calc(data))
            answer=data[data.length-1]+(data[data.length-1]-data[data.length-2]);        
        else if(gs.calc(data))
            answer=data[data.length-1]*(data[data.length-1]/data[data.length-2]);   
        
        System.out.print(answer);        
    }    
}
