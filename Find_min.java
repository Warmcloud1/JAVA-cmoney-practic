import java.util.Scanner;

public class F{
    public static void main(String[] argv){        
        Scanner sc=new Scanner(System.in);
        int i;
        int[] num=new int[3];
        for(i=0;i<3;i++){
            num[i]=sc.nextInt();
        }           
        
        i=i-1;
        int min=num[i];
        
        while(i>=1){
            if(min>num[i-1])
                min=num[i-1];
            i--;
        }
        
        System.out.print(min);
    }
}
