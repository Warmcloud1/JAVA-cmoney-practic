import java.util.Scanner;

class Check{
    void ipv4(String ip){             
        int sum=0;
        if(ip.equals("0.0.0.0"))
            System.out.print("IPv4");
        
        else{
            for(int i=0;i<ip.length();i++){
                sum*=10;
                sum+=ip.charAt(i)-48;                
                
                if(sum==0&&i+1<ip.length()&&ip.charAt(i+1)!='.'){                    
                    System.out.print("不是合法的IP");
                    break;
                } // 如果SUM=0 而且 下一個字元不是點 即為0開頭 錯誤
                
                else if(i+1<ip.length()&&ip.charAt(i+1)=='.'){                    
                    if(sum>255||sum<0){
                        System.out.print("不是合法的IP");
                        break;
                    }
                    else{                  
                        sum=0;
                        i+=1;
                    }
                }//遇到.則結算 SUM 是否在範圍
                
                else if(i+1==ip.length())
                    if(sum>255||sum<0){
                        System.out.print("不是合法的IP");
                        break;
                    }
                    else
                        System.out.print("IPv4");
            }       
        }  //end else 
     }
    
    void ipv6(String ip){       
        int num=0,colon=0,d_colon=0;
        if(ip.equals("::"))
            System.out.print("IPv6");
        else{            
            for(int i=0;i<ip.length();i++){
                char c=ip.charAt(i);
                if(((c>=48&&c<=57)||(c>=65&&c<=90)||(c>=97&&c<=122))&&(i+1!=ip.length())){
                    num+=1;
                }
                //如果 位元是 0~9 a~z A~Z 且 不是IP的最後一位 
                
                else if(c==':'&&i+1<ip.length()&&ip.charAt(i+1)==':'){                    
                    if(d_colon==1) {
                        System.out.print("不是合法的IP");
                        break;
                    }
                    else{
                        if(num>4){
                        System.out.print("不是合法的IP");
                        break;
                        }
                        d_colon+=1;
                        i+=1;
                    }
                }// 雙冒號在一個IPv6 只能用一次 用來代替一連串 0 
                else if(c==':'){
                    if(num>4){
                        System.out.print("不是合法的IP");
                        break;
                    }
                    colon+=1;
                    num=0;
                }
                else if(i+1==ip.length()){                    
                    if((colon!=7&&d_colon!=1)||colon>7)
                        System.out.print("不是合法的IP");
                    //如果 colon不等於7時 check 有沒有 ::                     
                    else
                        System.out.print("IPv6");
                }
            }
        }
    }
}
   

public class Check_ipv4_ipv6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        Check c=new Check();
        String ip=sc.nextLine();
        boolean ip4=false;
        boolean ip6=false;        
        if(ip.length()-ip.replace(".","").length()==3) 
            ip4=true;        
        else     
            ip6=true;        
                
        if(ip4)
            c.ipv4(ip);
        if(ip6)
            c.ipv6(ip);
    }    
}
