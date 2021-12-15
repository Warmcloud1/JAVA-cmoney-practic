import java.util.Scanner;
class Oddeven{
    boolean oes(int[] store){        
        int front,sum;
        for(int i=1;i<store.length;i++){
            front=store[i-1];
            sum=front+store[i];
            if(sum%2==0) return false;
        }
        return true;
    }
}
        
public class OddEvenSequence2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Oddeven oe=new Oddeven();
        int times=sc.nextInt(),index=0;
        boolean[] result=new boolean[times];
        for(int i=0;i<times;i++){
            int num=sc.nextInt();
            int[] tmp=new int[num];
            int tmp_index=0;
            while(num-->0){
                tmp[tmp_index++]=sc.nextInt();
            }
            result[i]=oe.oes(tmp);
        }
        for(boolean r:result){
            if(r) 
                System.out.println("true");
            else
                System.out.println("false");
        }
    }    
}
