import java.util.Scanner;

class OEseq{
    Scanner sc=new Scanner(System.in);
    boolean oes(int size){
        boolean result=true;
        int num=sc.nextInt(),tmp=sc.nextInt();
        while(size-->=2){         
            if((num+tmp)%2==0) {
                result=false;
                break;
            }            
            else if(size>=2){
                num=tmp;
                tmp=sc.nextInt();
            }
        }   
        return result;
    }
}
        
public class OddEvensequence {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        OEseq oeseq=new OEseq();
        int times=sc.nextInt(),index=0;
        boolean[] store=new boolean[times];
        for(int i=0;i<times;i++){
            int size=sc.nextInt();
            store[index++]=oeseq.oes(size);
        }
        for(Boolean b:store){
            if(b)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
        
}
