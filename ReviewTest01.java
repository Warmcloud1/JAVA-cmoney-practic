import java.util.Scanner;

public class Main {
    public static boolean compare(String word,String dict){
        //如果單字直接就存在不用湊
        if(dict.indexOf(word) != -1){
            return true;
        }
        char[] wordChar = word.toCharArray();
        boolean[] checkRecord = new boolean[dict.length()];

        for(char c: wordChar){
            int index = dict.indexOf(c);
            if(index == -1){
                return false;
            }
            //該字元第一個發現位置(indexOf())已經被用過,往後找 如果 沒有了就直接return false
            while(checkRecord[index] == true){
                index = dict.indexOf(c, index + 1);
                if(index == -1 || index >= dict.length()){
                    return false;
                }
                else
                    break;
            }
            //如果當前字元發現位置(不為-1)沒被用過，就把該位置記錄下來
            checkRecord[index] = true;
        }// end foreach()
        return true;//順利跑完整組word
    }//end compare()

    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int totalWords = sc.nextInt(),
            uselessInput = 0,
            finalAns = 0;
        String[] words = new String[totalWords];
        for(int i = 0; i < totalWords; i++) {
            uselessInput = sc.nextInt();
        }
        sc.nextLine();// new line because after sc.nextInt();
        for(int i = 0; i < totalWords; i++){
            words[i] = sc.next();
        }
        uselessInput = sc.nextInt();
        sc.nextLine();
        String dictChars = sc.nextLine();

        for(String w: words){
            if(compare(w, dictChars)){
                finalAns += w.length();
            }
        }
        System.out.print(finalAns);
    }
}
