/*
其實蠻簡單的，可見當下真的很緊張
*/
import java.util.Scanner;

class KeyboardCheck{
    //鍵盤三排 當作字典
    String line1 = "qwertyuiop",
           line2 = "asdfghjkl",
           line3 = "zxcvbnm";
           
    public boolean singleLine(String word){
        boolean l1 = false,
                l2 = false,
                l3 = false;
        for(int i = 0; i < word.length(); i++){
            char tmpChar = word.charAt(i);
            //這個單字裡的字元 有出現在哪排 哪排的boolean 為true
            if(line1.indexOf(tmpChar) != -1){
                l1 = true;
            }
            if(line2.indexOf(tmpChar) != -1){
                l2 = true;
            }
            if(line3.indexOf(tmpChar) != -1){
                l3 = true;
            }
            /*
              檢查到最後一個位元時 ， 符合兩條件為true
              1. 同時存在三排，false   WHY? 因為這是 互斥或 唯一一個多排會判斷為 true的狀況
              2. 三個互斥或 (不論排列順序) TTT → 上述1處理掉了  FFF / TTF 都會判斷為false  只有TFF 是 true
            */
            if(i == word.length() - 1 && !(l1 && l2 && l3) && (l1 ^ l2 ^ l3)){
                return true;
            }
        }
        return false;
    }
}

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        KeyboardCheck kc = new KeyboardCheck();      
        int totalWords = sc.nextInt(); // 共幾個單字要判斷
        int[] wordsLen = new int[totalWords]; // 每個單字多長
        for(int i = 0; i < totalWords; i++){
            wordsLen[i] = sc.nextInt();
        }        
        sc.nextLine(); //由於前面是nextInt() 要先處理換行
        String data = sc.nextLine(); //要判斷的所有單字 用空白區分
        String[] words = new String[totalWords]; //總共要存幾個單字
        //區分每個單字 存到 words[]
        int start_i = 0,
            end_i = 0;
        for(int i = 0; i < totalWords; i++){
            if(i != 0){
                start_i = end_i + 1;
            }
            end_i = start_i + wordsLen[i];
            words[i] = data.substring(start_i, end_i);
        }
        //上面為 冗長的 資料輸入        
        //下方為 每個單字各呼叫一次判斷方法
        for(int i = 0; i < totalWords; i++){
            if(kc.singleLine(words[i])){
                if(i == 0){
                    System.out.print(words[i]);
                }
                else{
                    System.out.print(" " + words[i]);
                }
            }
        }
    }
}
