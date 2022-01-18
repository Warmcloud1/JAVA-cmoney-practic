/*
仔細想想其實很簡單 根本不用用HashMap 和 ArrayList
感覺是時間壓力影響
*/
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);         
    int total = sc.nextInt(), //數字卡最大
        totalLoss = 0;        //缺幾張
    int[] nowCard = new int[total]; // 存現在有什麼卡
    boolean[] find = new boolean[total + 1]; // +1 為了符合數字卡範圍 為1 ~ total  現在如果有找到就改為true
    //輸入現在有什麼卡， 有找到就在對應的find 改為 true    
    for(int i = 0; i < total; i++){
        int num = sc.nextInt();
        nowCard[i] = num;
        if(!find[num]){
            find[num] = true;
        }
    }
    //從1~total 找一遍  如果 對應的值為false 沒找到 就印出
    for(int i = 1; i <= total; i ++){
        if(!find[i]){
            //處理一下 印出的空格
            if(totalLoss == 0){
                System.out.print(i);
                totalLoss += 1;
            }
            else
                System.out.print(" " + i);
        }
    }    
  }//end main()
}
