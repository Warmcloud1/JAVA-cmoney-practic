import java.util.Scanner;

class Root_str_compare{
    boolean compare(String str,String[] root){
        boolean ans=false;
        int s_i,r_i,s_inner_i,r_inner_i=0;
        for(s_i=0;s_i<str.length();){            
            for(r_i=0;r_i<root.length;r_i++){
                s_inner_i=s_i;
                r_inner_i=0;                                   
                if(str.charAt(s_inner_i)==root[r_i].charAt(r_inner_i)){                    
                    while(str.charAt(s_inner_i)==root[r_i].charAt(r_inner_i)){
                        if(s_inner_i+1<str.length()&&r_inner_i+1<root[r_i].length()){
                            s_inner_i++;
                            r_inner_i++;
                        }
                        else if(r_inner_i+1==root[r_i].length()){                            
                            ans=true;
                            break;
                        }                                            
                    }//end of while                    
                }//end of if in inner for
                else if(str.charAt(s_inner_i)!=root[r_i].charAt(r_inner_i)&&r_i+1==root.length){                    
                    ans=false;
                    break;
                }//end of else if in inner for 
                if(ans&&r_inner_i+1==root[r_i].length())
                    break;                        
            }//end of inner for         
            if(r_i==root.length) 
                r_i-=1;
            if(ans==true&&s_i+root[r_i].length()==str.length())
                break;
            else if(ans==true&&s_i+1!=str.length())                                
                s_i+=root[r_i].length();                          
            else                
                break;
        }        
        return ans;
    }    
}




public class Root_string_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        Root_str_compare rsc=new Root_str_compare();
        String str,root;
        int len_str,len_root,root_arr_len,root_arr_index=0,root_space_index=0;        
        len_str=sc.nextInt();
        sc.nextLine();
        str=sc.nextLine();
        len_root=sc.nextInt();
        sc.nextLine();
        root=sc.nextLine();        
        root_arr_len=(root.length()-root.replaceAll(" ","").length())+1;
        String[] root_arr=new String[root_arr_len];
        for(int i=0;i<len_root;i++){
            if(root.charAt(i)==' '){
                root_arr[root_arr_index++]=root.substring(root_space_index,i);
                root_space_index=i+1;
            }
            else if(i+1==len_root)
                root_arr[root_arr_index]=root.substring(root_space_index,i+1);                            
        }                
       if(rsc.compare(str, root_arr))
           System.out.print("true");
       else
           System.out.print("false");
    }    
}
