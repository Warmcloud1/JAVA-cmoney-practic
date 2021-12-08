import java.util.Scanner;

class BMI_calculator{
  double index(double height,double weight)
  {  	  
      height=height/100.0;
      height*=height;
      return weight/height;
  } 
}
  
public class BMI{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double height,weight,result;    
    height=sc.nextDouble();
    weight=sc.nextDouble();
    BMI_calculator bmic=new BMI_calculator();
    result=bmic.index(height,weight);
    
    if(result<18.5) System.out.printf("%.1f 過輕",result);
    else if(result<24) System.out.printf("%.1f 正常",result);
    else if(result<27) System.out.printf("%.1f 過重",result);
    else if(result<30) System.out.printf("%.1f 輕度肥胖",result);
    else if(result<35) System.out.printf("%.1f 中度肥胖",result);
    else System.out.printf("%.1f 重度肥胖",result);  
  }
}
