/*
OS:第一次在有時間壓力下作答 還真的有點寫不出來QQ
除了最後一題真的看不懂 ， 這題應該也要對的 可惜。
要多多琢磨 字串輸入&比對 
而且這次作答 有關於字串的兩題
我其實都沒有完全的利用到題目給的數字，感覺不是出題者要的，再慢慢想。

3
4 4 5
well done world
7
wdrolne

輸出 : 9

3
3 4 7
bee tall brother
7
betlore

輸出: 3
*/
import java.util.Scanner;

class Check{
    public String dict;
    public Check(String dict){
        this.dict = dict;
    }
    public boolean calc(String str){
        boolean ans = true,
                find = false;
        boolean[] firstFind = new boolean[dict.length()];
        for(int i = 0; i < firstFind.length; i ++){
            firstFind[i] = true;
        }
        
        for(int i = 0; i < str.length(); i ++){
           char c = str.charAt(i);
           for(int j = 0; j < dict.length(); j ++){
               if(dict.charAt(j) == c && firstFind[j]){
                   ans = true;
                   firstFind[j] = false;
                   find = true;
                   break;
               }
               else if(dict.charAt(j) == c && !firstFind[j]){
                   ans = false;
               }
           }
        }
        
        if(find == false){
            ans = false;
        }
        return ans;
    }
}

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt(),
        sum = 0;
        
    int[] len = new int[total];
    for(int i = 0; i < total; i ++){
        len[i] = sc.nextInt();
    }
    
    sc.nextLine();
    String data = sc.nextLine();
    String[] words = data.split(" ");
    
    int dictLen = sc.nextInt();
    sc.nextLine();
    Check c = new Check(new String(sc.nextLine()));
    
    for(int i = 0; i < words.length; i ++){
        if(c.calc(words[i])){
            sum += words[i].length();
        }
    }
    System.out.print(sum);
  }
}
