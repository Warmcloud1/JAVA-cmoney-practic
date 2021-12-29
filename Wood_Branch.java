import java.util.Scanner;

class Branch{
    int calc(int initial){
        int total=initial,tmp=initial;
        for(int i=initial-1;i>1;i--){
            tmp*=i;
            total+=tmp;
        }        
        if(initial!=1) total+=1;
        return total;
    }
}

public class Wood_Branch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Branch b=new Branch();
        int initial=sc.nextInt();        
        System.out.print(b.calc(initial));
    }
}
