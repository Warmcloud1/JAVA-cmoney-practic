import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int point,sum,max_p=0,max_i=0;
        int[] result=new int[3];
        for(int i=0;i<3;i++){
            sum=0;
            for(int j=0;j<2;j++){
                point=sc.nextInt();
                sum+=point;
            }
            result[i]=sum;
        }
        
        for(int i=0;i<result.length;i++){
            if(result[i]>max_p){
                max_p=result[i];
                max_i=i;
            }
        }
        
        switch(max_i){
            case 0:
                System.out.print("A");
                break;
            case 1:
                System.out.print("B");
                break;
            default:
                System.out.print("");
        }
    }
    
}
