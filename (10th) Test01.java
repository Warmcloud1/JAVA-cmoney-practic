import java.util.Scanner;

class Check{
    public String dict;
    public Check(String dict){
        this.dict = dict;
    }
    public boolean calc(String word){
        boolean ans = true;
        boolean[] find = new boolean[dict.length()];
        
        for(int i = 0; i < word.length(); i++){
            char tmpChar = word.charAt(i);
            int startIndex = dict.indexOf(tmpChar);
            //根本沒這個字的狀況
            if(startIndex == -1){
                return false;
            }
            //有這個字，index指向該字第一次出現在dict中的位置，並往後找 處理同樣的字出現1次以上的狀況
            for(; startIndex < dict.length(); startIndex++){
                //符合 1. 字元相同  2. 在目前字典位置的這個字元 沒有被找過
                if(tmpChar == dict.charAt(startIndex) && !find[startIndex]){
                    //一旦找到符合 字典位置標誌為找過，跳出
                    find[startIndex] = true;
                    break;
                }
                //已經到dict尾，單字目前的字元 仍然沒有在字典中找到符合if情況
                else if(startIndex == dict.length() - 1){
                    ans = false;
                    break;
                }
            }
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
