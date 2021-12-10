import java.util.Scanner;

public class Reverse2{
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        int old_num,flag=1;
        long new_num=0;
        old_num=sc.nextInt();
        if(old_num<0){
            old_num*=-1;
            flag=-1;
        }
       
        while(old_num>0)
        {
            new_num*=10;
            new_num+=old_num%10;
            old_num/=10;
        }
        if(flag==1&&(new_num>Integer.MAX_VALUE)){
            System.out.println(0);
        }
        else if(flag==-1&&(new_num*-1)<(Integer.MIN_VALUE)){
            System.out.println(0);
        }                
        else if(flag==1){
            System.out.println(new_num);
        }
        else{
            System.out.println("-"+new_num);            
        }
    }
}
