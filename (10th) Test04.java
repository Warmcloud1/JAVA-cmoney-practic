/*
nums[numsIndex] = nums[numsIndex - 1] * 2;
numsIndex += 1;

↓寫這樣 編譯讀不進去 不知道為什麼??
nums[numsIndex++] = nums[numsIndex - 1] * 2;

Q:
小華是球隊經理，因為球隊比賽的節奏很緊湊，所以他在計算球員表現時會使用簡寫的方式進行紀錄，然後在比賽結束後進行重新計算，請寫一隻程式協助小華進行計算

規則如下：

數字代表得到的分數(介於1~1000之間的整數)
E 代表前一個數字是記錄錯誤的數字，請移除(一定會有前一個數字)
D代表新分數為前一個分數乘於2(一定會有前一個數字)
-代表新分數為前兩個分數相減(排前的數字減排後面的數字，負數代表扣分，一定會有前兩個數字)
+代表新分數為前兩個分數相加(一定會有前兩個數字)
若是沒有數字或者是算完沒有數字(被E扣完)則顯示0ex:35EE => E會把所有數字扣光
所有英文字都會是大寫
*/
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dataLen = sc.nextInt(),
            numsIndex = 0,
            sum = 0;
        sc.nextLine();
        String data = sc.nextLine();
        int[] nums = new int[dataLen]; // 假設7個都是放數字
        
        for(int i = 0; i < data.length(); i++){
            char tmpChar = data.charAt(i);
            if(tmpChar == ' '){
                continue;
            }
            else if(tmpChar >= '0' && tmpChar <= '9'){
                nums[numsIndex] = (int)tmpChar - '0';
                numsIndex += 1;
            }
            else if(tmpChar == 'E'){
                numsIndex -= 1;
                nums[numsIndex] = 0;
            }
            else if(tmpChar == 'D'){
                if(numsIndex - 1 >= 0){
                    nums[numsIndex] = nums[numsIndex - 1] * 2;
                    numsIndex += 1;
                }
            }
            else if(tmpChar == '+'){
                if(numsIndex - 2 >= 0){
                    nums[numsIndex] = nums[numsIndex - 2] + nums[numsIndex - 1];
                    numsIndex += 1;
                }
            }
            else if(tmpChar == '-'){
                if(numsIndex - 2 >= 0){
                    nums[numsIndex] = nums[numsIndex - 2] - nums[numsIndex - 1];
                    numsIndex += 1;
                }
            }
            
            for(int n: nums){
                System.out.print(" nums : " + n);
            }
            System.out.println();
            
        }
        
        for(int i: nums){
            sum += i;
        }
        
        System.out.print(sum);
    }
}
