import java.util.Scanner;

public class Matrix_reverse_output {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt(),col=sc.nextInt();
        int[][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                int d=matrix[j][i];
                System.out.print(d+" ");
            }
            System.out.println();
        }        
    }        
}
