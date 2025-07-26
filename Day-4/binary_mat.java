package arrays_2d;
import java.util.*;

public class binary_mat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int  cols = sc.nextInt();
        int [][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(matrix[i][j] % 2 == 0){
                    matrix[i][j] = 0;
                }
                else{
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i=0;i<rows;i++){
            int count = 0;
            for (int j=0;j<cols;j++){
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            System.out.printf("row:%d count:%d%n",i,count);
        }
    }
}
