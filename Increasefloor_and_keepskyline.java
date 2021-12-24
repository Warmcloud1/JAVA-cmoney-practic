import java.util.Scanner;

class Floor_max{    
    int row_max(int[] data){
        int r_max=0;
        for(int i:data){
            if(r_max<i)
                r_max=i;
        }        
        return r_max;
    }
        
    int col_max(int[][] data,int col){        
        int c_max=0;
        for(int[] sub_data:data){
            if(sub_data[col]>c_max)
                c_max=sub_data[col];
        }        
        return c_max;
    }
}


public class Increasefloor_and_keepskyline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Floor_max fm=new Floor_max();
        int size=sc.nextInt(),max=0,r_max=0,c_max=0,sum=0;
        int[][] city=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                city[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++){
            r_max=fm.row_max(city[i]);            
            for(int j=0;j<size;j++){                
              c_max=fm.col_max(city,j);
              max=(c_max>r_max)?r_max:c_max;
              if(city[i][j]<max)
                  sum+=max-city[i][j];             
            }           
        }
        System.out.print(sum);
    }    
}
