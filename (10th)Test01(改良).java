/* 
這次運用到每一個題目給的數字
雖然有點硬要用 但是比之前沒有好一點
*/
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        //輸入共要找幾個單字 和每個單字多長
        int totalWords = sc.nextInt();
        int[] wordsLen = new int[totalWords];
        String[] words = new String[totalWords];
        for(int i = 0; i < totalWords; i++){
            int len = sc.nextInt();
            wordsLen[i] = len;
        }
        //把所有單字輸入 以空白隔開
        sc.nextLine();
        String data = sc.nextLine();
        //根據單字長度把每個單字擷取出來，設substring()用的兩個參數
        int start_i = 0,
            end_i = 0;
        //如果第一個單字 start_i = 0 往後要加上單字長 + 1 (跳過空格)，
        //              end_i 直接= 單字長，其餘要加上上一個單字長度
        for(int i = 0; i < totalWords; i++){
            if(i != 0){
                start_i = end_i + 1;
            }
            end_i = start_i + wordsLen[i];
            words[i] = data.substring(start_i, end_i);
        }
        //輸入字典長度 & 字典本身
        int dictLen = sc.nextInt();
        sc.nextLine();
        String dict = sc.nextLine();
        int outputLen = 0;
        //開始尋找 每個單字能不能用字典的字元拼出來
        for(int i = 0; i < totalWords; i++){
            //要不要加入此單字長度
            boolean plusLen = true;
            //每一個單字都要獨立查字典，所以每次設一個boolean[字典長度]，如果字典的字元被查到則改true
            boolean[] dictCheck = new boolean[dictLen];
            //進去尋找第i個單字的每個字元
            for(int j = 0; j < wordsLen[i]; j++){
                char wordsChar = words[i].charAt(j);
                //設定找尋dict內字元的index為 k， k從 當前單字字元 第一次在字典出現的位置開始找
                int k = dict.indexOf(wordsChar);
                //如果根本沒出現  那就不用判斷 直接false
                if(k == -1){
                    plusLen = false;
                    break;
                }
                //如果有出現，那遍巡一次dict內的字元(因為同字元在字典內有可能出現1次以上)，如果有找到把那該位置改為true跳出
                for(; k < dictLen; k++){
                    //要符合2條件才會去更改 dictCehck 1.字元要一樣   2. 該字典位置的字元沒被查過
                    if(!dictCheck[k] && wordsChar == dict.charAt(k)){
                        dictCheck[k] = true;
                        break;
                    }
                    //如果沒有符合的，而且已經到字典尾端，則false
                    else{
                        if(k == dictLen - 1 ){
                            plusLen = false;
                            break;
                        }
                    }
                }// end for() 遍巡字典找單字的字元是否存在 and 被查過
            }// end for() 遍尋單字內字元
            if(plusLen){
                outputLen += wordsLen[i];
            }
        }// end for() 所有單字查詢
        System.out.print(outputLen);
    }//end main()
}//end clss Main
