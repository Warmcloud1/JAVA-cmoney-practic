import java.util.Scanner;

class Day{
    int cal(int n,int k,int m){
        int d=0,d_total=0;
        while(k-->0){
            d_total+=n;
            n=n*9/10;
        }           
        
        while(m>0){
            m-=d_total;
            d++;
        }
        return d;
    }
}
        
public class Exericise4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Day d=new Day();
        int Speed=sc.nextInt(),Hour=sc.nextInt(),Total=sc.nextInt();         
        System.out.print(d.cal(Speed,Hour,Total));        
    }    
}
