import java.util.Scanner;

class Score_calc{
  int result(int num){
  	if(num>=40) return 100;
    else if(num>20){
      return 80+num-20;
    }
    else if(num>10){
      return 60+(num-10)*2;
    }
    else
      return num*6;
  }
}
      
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total=sc.nextInt();
    Score_calc score=new Score_calc();
    System.out.println(score.result(total));
  }
}
