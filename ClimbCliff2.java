import java.util.*;

class Climb_cal{
    String climb(double up,double down,double height,double fatigue){
        int days=1;
        double now=up-down,fatigue_drop=up*fatigue/100.0;
        while(now>=0&&now<=height){
            up-=fatigue_drop;
            days++;
            now+=up;
            if(now>=height) break;            
            now-=down;
        }
        if(now>=height){
            String ans="success-"+days;
            return ans;
        }
           
        else{                     
            String ans="fail-"+days;     
            return ans;
        } 
    }
            
}

public class ClimbCliff2 {
    public static void main(String[] args) {        
        int i=0,times;
        double up,down,height,fatigue;                          
        Climb_cal cc=new Climb_cal();
        Scanner sc=new Scanner(System.in);        
        times=sc.nextInt();
        String[] tmp=new String[times];
                
        while(times-->0){        
            up=sc.nextDouble();
            down=sc.nextDouble();
            height=sc.nextDouble();
            fatigue=sc.nextDouble();                
            tmp[i++]=cc.climb(up,down,height,fatigue);
        }        
        for(String t:tmp)
            System.out.println(t);
    }    
}
