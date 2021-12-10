import java.util.Scanner;
/* 前面成績一直用if else   這次複習一下switch 限制range */
public class Main{
    public static void main(String[] argv){        
        Scanner sc=new Scanner(System.in);
        int heart_beat=sc.nextInt();
        
        switch(heart_beat/10)
        {
            case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
                System.out.println("非運動狀態");
                break;
            case 11:
                System.out.println("輕度");
                break;
            case 12:case 13:
                System.out.println("輕中度");
                break;
            case 14:case 15:
                System.out.println("中度");
                break;
            default:
                System.out.println("高強度");            
        }    
    }
}
