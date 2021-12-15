import java.util.Scanner;

public class Track_expenses2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pre_cost=sc.nextInt(),next_cost,diff,up=0,down=0;        
        for(int i=2;i<=7;i++){    
            next_cost=sc.nextInt();
            diff=next_cost-pre_cost;
            if(diff<0&&diff>=-1000){
                pre_cost=next_cost;
              	down++;
              }
          	else if(diff>0&&diff<=1000){
                pre_cost=next_cost;
              	up++;
            }
        }        
        if(up-down<0)
            System.out.println("變得節省");
        else if(up-down>0)
            System.out.println("變得會花");
        else if(up==down)
            System.out.println("沒變");
    }
}
