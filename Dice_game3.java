import java.util.Scanner;

class Max{
    int calc(int[] data){
        int max=0;
        for(int i=0;i<data.length;i++){
            if(max<data[i])
                max=data[i];                            
        }
        return max;
    }
}

public class Dice_game3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Max m=new Max();
       int players=sc.nextInt(),turns=sc.nextInt();
       int points,turn_max=0;
       int[] result=new int[players];
       int[] tmp=new int[players];
       
       for(int i=0;i<turns;i++){
           for(int j=0;j<players;j++){
               points=sc.nextInt();
               tmp[j]=points;
           }           
           
           turn_max=m.calc(tmp); 
           
           for(int k=0;k<result.length;k++){
               if(tmp[k]==turn_max)
                   result[k]+=1;
           }
       }
       
       for(int i:result){
           System.out.println(i);
       }
    }
}
