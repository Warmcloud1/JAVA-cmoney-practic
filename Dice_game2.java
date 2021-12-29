import java.util.Scanner;

public class Dice_game2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
      	int players=3,max,point,total_max_i=-1,total_max=0,total_max_times=0;
		int[] data=new int[players];
        for(int i=0;i<players;i++){
          max=0;
          for(int j=0;j<3;j++){
            point=sc.nextInt();
            if(max<point)              
              max=point;
            if(total_max<max)
              total_max=max;
          }
          data[i]=max;
        }
        //第一個for 將每個玩家的最大點數存入陣列
        for(int i=0;i<players;i++){
            if(data[i]==total_max){
                total_max_i=i;
                total_max_times+=1;
            }
        }
        //判斷最大數有沒有重複 和紀錄最大的I
        if(total_max_times==1)
            System.out.print((char)(total_max_i+65));
        else
            System.out.print("不分勝負");
    }
}
