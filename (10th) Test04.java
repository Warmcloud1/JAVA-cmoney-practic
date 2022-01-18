/*
nums[numsIndex] = nums[numsIndex - 1] * 2;
numsIndex += 1;

↓寫這樣 編譯讀不進去 不知道為什麼??
nums[numsIndex++] = nums[numsIndex - 1] * 2;

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
