import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean p=true;
        int times,i;
        times=sc.nextInt();
        int[] arr=new int [times];
        for(i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        for(Integer num:arr){
            if(num==1){
               System.out.println("false");
               continue;
            }
            p=true;
            for(int j=2;j<=num/2;j++){
                if(num%j==0){
                   p=false;
                   break;
                }
            }
            if(p)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
