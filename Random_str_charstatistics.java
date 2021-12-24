import java.util.Scanner;

public class Random_str_charstatistics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt(),letter=0,space=0,num=0,others_char=0;
        sc.nextLine();
        String data=sc.nextLine();
        for(int i=0;i<data.length();i++){
            if(data.charAt(i)==' '){
                space+=1;
            }
            else if(data.charAt(i)>=48&&data.charAt(i)<=57){
                num+=1;
            }
            else if((data.charAt(i)>=65&&data.charAt(i)<=80)||(data.charAt(i)>=97&&data.charAt(i)<=120)){
                letter+=1;
            }
            else
                others_char+=1;            
        }
        System.out.printf("%d\n%d\n%d\n%d\n",letter,space,num,others_char);
    }    
}
