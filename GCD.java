import java.util.Scanner;

class Gcd_calc{
  int gcd(int a,int b){
    while(a%b!=0)
    {
      int tmp=b;
      b=a%b;
      a=tmp;
    }
    return b;
  }
}

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Gcd_calc gc=new Gcd_calc();
    int numa,numb;
    numa=sc.nextInt();
    numb=sc.nextInt();
    System.out.println(gc.gcd(numa,numb));
  }
}
