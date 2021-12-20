import java.util.Scanner;

public class Find_seperate_num {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int amount=sc.nextInt(),index=0,data_i=0;
       String str="";
       while(str.equals("")){
           str=sc.nextLine();
       }       
       
       int[] data=new int[amount];
              
       while(amount-->0){
           int tmp=0;
           while(str.charAt(index)!=' '){          
               int digit=str.charAt(index)-48;               
               tmp=tmp*10+digit;
               if((index+1)<str.length())                              
                   index+=1;
               else if(index+1==str.length())
                   break;
           }                        
           data[data_i++]=tmp;               
           if((index+1)<str.length())                              
               index+=1;           
       }             
      
       for(int i=0;i<data.length;i++){
           boolean d=false;
           for(int j=0;j<data.length;j++){
               if(j!=i&&data[j]==data[i]){
                   d=true;
                   break;
               }
           }
           if(!d){           
               System.out.println(data[i]);
               break;
           }
       }
    }
}
