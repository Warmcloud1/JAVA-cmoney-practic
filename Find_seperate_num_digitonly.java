import java.util.Scanner;

public class Find_seperate_num_digitonly {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int amount=sc.nextInt(),index=0;
       String str="";
       while(str.equals("")){
           str=sc.nextLine();
       }
       while(amount>0){
           int target=str.charAt(index);           
           boolean d=false; //double
           amount-=1;
           for(int i=0;i<str.length();i+=2){
               if(i!=index&&target==str.charAt(i)){
                   d=true;
                   break;
               }
           }
           if(!d)
               System.out.println(str.charAt(index));
           index+=2;
       }
    }
}
