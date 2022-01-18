/*
給予一個字串(只有小寫英文字)，統計裡面字母出現的頻率，將之打散重組，字母出現頻率越多次排在越前面(相同字母排在一起)，若是次數相同則依照出現在字母表的順序排序

4
tell  輸出 llet

7
battlee 輸出 eettabl
*/

import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[][] dict = new int[26][1];
    sc.nextLine();
    String data = sc.nextLine();
    int max = 0;
    for(int i = 0; i < len; i ++){
        char c = data.charAt(i);
        dict[c - 97][0] += 1;
        max = (dict[c - 97][0] > max) ? dict[c - 97][0] : max;
    }
    int outputTimes = 0;
    while(outputTimes != len){
        for(int i = 0; i < dict.length; i ++){
            if(dict[i][0] == max){
                for(int j = 0; j < max; j ++){
                    System.out.print((char) (i + 97));
                    outputTimes += 1;
                }
            }
        }
        max -= 1;
    }
  }
}
