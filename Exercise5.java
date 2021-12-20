import java.util.Scanner;
import java.util.ArrayList;

class Max_sta{
    int b_sta=1000; //basic_stamina
    int calc(int C,int G,ArrayList<Integer> data){
        for(int i=0;i<data.size();i++){
            int tmp=b_sta,times=data.get(i),d_total=0;
            if((i+1)%2==0)
                C-=20;            
            
            while(tmp>=C&&times-->0){
                tmp-=C;               
                d_total+=C;
            }
            
            b_sta+=100*(d_total/100);
        }
        return b_sta;
    }
}

public class Exercise5 {
    public static void main(String[] args) {       
        Scanner sc=new Scanner(System.in);        
        Max_sta ms=new Max_sta();
        int sta=sc.nextInt(),c_sta=sc.nextInt(),times,day;
        ArrayList<Integer> al=new ArrayList<>();
        while(true){
            times=sc.nextInt();
            if(times==-1)
                break;            
            else 
                al.add(times);
        }
        System.out.print(ms.calc(sta,c_sta,al));
    }
}
