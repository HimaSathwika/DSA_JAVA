package arrays_2d;
import java.util.*;

public class dia_min_max_rest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int max_ele = Integer.MIN_VALUE;
        int min_ele = Integer.MAX_VALUE;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if ((i == j) || (i+j == cols-1)){
                    if (matrix[i][j] < min_ele){
                        min_ele = matrix[i][j];
                    } 
                }
                else{
                    if(matrix[i][j] > max_ele){
                        max_ele = matrix[i][j];
                    }
                } 
            }
        }
        System.out.println(max_ele);
        System.out.println(min_ele);
        System.out.println(max_ele-min_ele);
    }
}
