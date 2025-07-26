package Arrays_2D;
import java.util.*;

import String;
public class max_min {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int max_ele = Integer.MIN_VALUE;
        int min_ele = Integer.MAX_VALUE;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (matrix[i][j] < min_ele){
                    min_ele = matrix[i][j];
                }
                if (matrix[i][j] > max_ele){
                    max_ele = matrix[i][j];
                }
            }
        }
        System.out.println("Sum: "+ (min_ele+max_ele));
        System.out.println("Difference: "+(max_ele-min_ele));
   } 
}
