import java.util.Scanner;

class Weird_calc{
    String calc(int male,int female,int days){
        String str="";
        while(days-->0){
            int new_male=male*2;
            int tmp=male;
            male=female+new_male;
            female=tmp;            
        }
        str+=male+" "+female;
        return str;
    }
}

public class WeirdAnimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int male,female,days,i=0;
        Weird_calc wc=new Weird_calc();
        int times=sc.nextInt();
        String[] store=new String[times];
        while(times-->0){
            male=sc.nextInt();
            female=sc.nextInt();
            days=sc.nextInt();
            store[i++]=wc.calc(male, female, days);
        }        
        for(String str:store){
            System.out.println(str);
        }
    }    
}
