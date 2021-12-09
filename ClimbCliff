import java.util.Scanner;

class Climb_cal{
    void climb(double up,double down,double height,double fatigue){
        int days=1;
        double now=up-down,fatigue_drop=up*fatigue/100.0;
        while(now>=0&&now<=height){
            up-=fatigue_drop;
            days++;
            now+=up;
            if(now>=height) break;            
            now-=down;
        }
        if(now>=height)
            System.out.printf("success-%d",days);
        else
            System.out.printf("fail-%d",days);
    } 
            
}



public class ClimbCliff {
    public static void main(String[] args) {
        int times;
        double up,down,height,fatigue;
        Climb_cal cc=new Climb_cal();
        Scanner sc=new Scanner(System.in);
        times=sc.nextInt();
        while(times-->0){        
            up=sc.nextDouble();
            down=sc.nextDouble();
            height=sc.nextDouble();
            fatigue=sc.nextDouble();                
            cc.climb(up,down,height,fatigue);
        }        
    }
    
}
