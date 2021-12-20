import java.util.Scanner;

public class StuId_score {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),index=0;
        int[][] data=new int[N][2];
        while(N-->0){
            data[index][0]=sc.nextInt();
            data[index++][1]=sc.nextInt();
        }        
        for(int i=0;i<data.length-1;i++){            
            int max_i=i,max=data[i][1],tmp_i,tmp_score;
            for(int j=i;j<data.length;j++){
                if(max<data[j][1]){
                    max_i=j;
                    max=data[j][1];
                }
            }
            if(max_i!=i){
                tmp_i=data[max_i][0];
                tmp_score=data[max_i][1];
                data[max_i][0]=data[i][0];
                data[max_i][1]=data[i][1];
                data[i][0]=tmp_i;
                data[i][1]=tmp_score;
            }
        }              
        
        for(int i=0;i<data.length;i++){
            System.out.printf("%d.%d\n",data[i][0],data[i][1]);
        }
    }    
}
