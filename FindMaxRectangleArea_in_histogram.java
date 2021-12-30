import java.util.Scanner;

class FindMaxRecArea{
    int calc(int[] data){
        int len,size=0,area=0,tmp_area,tmp_i;
        for(int i=0;i<data.length;i++){
            tmp_i=i;
            len=data[tmp_i];
            size++; //本身底長            
            //往前找 或 往後找  的高度>=自己 底長+1
            while(tmp_i-1>=0&&data[tmp_i-1]>=len){
                tmp_i--;
                size++;
            }
            
            tmp_i=i; //指針回到原本的i
            while(tmp_i+1!=data.length&&data[tmp_i+1]>=len){
                tmp_i++;
                size++;
            }
            
            tmp_area=len*size;
            if(area<tmp_area)
                area=tmp_area;
            tmp_area=0;
            size=0;
        }
        return area;
    }
}


public class FindMaxRectangleArea_in_histogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FindMaxRecArea fmra=new FindMaxRecArea();
        int size=sc.nextInt(),max_area;
        int[] data=new int[size];
        for(int i=0;i<size;i++)
            data[i]=sc.nextInt();   
        
        System.out.print(fmra.calc(data));
    }    
}
