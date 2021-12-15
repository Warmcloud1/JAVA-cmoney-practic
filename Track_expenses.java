import java.util.Scanner;

public class Track_expenses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input_time=2,cost_1,cost_2,diff,total=0;        
        cost_1=sc.nextInt();
        cost_2=sc.nextInt();
        diff=cost_2-cost_1;
        while(input_time<7){            
            if(Math.abs(diff)>=1000){
                cost_2=sc.nextInt();
                input_time++;
            }
            else if(diff>0){ // 後-前>0  
                total++;
                cost_1=cost_2;
                cost_2=sc.nextInt();
                input_time++;
            }
            else{
                total--;
                cost_1=cost_2;
                cost_2=sc.nextInt();
                input_time++;                
            }
        }
        if(total==0)
            System.out.println("沒變");
        else if(total<0)
            System.out.println("變得節省");
        else
            System.out.println("變得會花");                
    }    
}
