import java.util.Scanner;


class Prime{
  void isprime(int n){
    boolean prime=true;
  	for(int i=2;i<=n/2;i++){
      if(n%i==0){
        prime=false;
        break;
      }
    }
    if(prime) System.out.println("true");
    else System.out.println("false");
  }
}
      
    
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Prime p=new Prime();
    int i=0,times;
    times=sc.nextInt();
    int[] arr_num=new int[times];
    while(times-->0)
      arr_num[i++]=sc.nextInt();
    for(Integer j:arr_num)
    {
      if(j==1)
        System.out.println("false");
      else p.isprime(j);
    }
  }
}
