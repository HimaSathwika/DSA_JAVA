import java.util.*;

import String;
public class min_max_notcorner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int min_ele =Integer.MAX_VALUE;
        int max_ele =  Integer.MIN_VALUE;
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if ((i == 0 && j == 0) || ((i == rows-1) && (j == cols-1)) || (i == 0 && j == cols-1) || (i == rows-1 && j == 0)){
                    continue;
                }
                if (matrix[i][j] > max_ele){
                    max_ele =matrix[i][j];
                }
                if (matrix[i][j] < min_ele){
                    min_ele = matrix[i][j];
                }
            }
        }
        System.out.println(min_ele);
        System.out.println(max_ele);
    }
}
