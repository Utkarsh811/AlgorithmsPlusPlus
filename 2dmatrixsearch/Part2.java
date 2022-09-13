//LEETCODE 74. Search a 2D Matrix

import java.util.*;

public class Part2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] matrix = new int[rows][cols];
    int i = 0;
    int j = 0;
    //matrix  initialization
    for (i = 0; i < rows; i++) {
      for (j = 0; j < cols; j++) {
        System.out.println("enter" + i + j);

        matrix[i][j] = sc.nextInt();
      }
    }
    for (i = 0; i < rows; i++) {
      for (j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + ",");
      }
      System.out.println();
    }
    //2D MMATRIX SEARCH
    int target=sc.nextInt();
    cols=matrix[0].length;
    rows=matrix.length;
        int totalelements=rows*cols;
        int in=0;
        int jn=0;
        int low=0;
        int high=totalelements-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            //break mid into coordinates
            in=mid/cols;///*****inportant part */
                jn=mid%cols;
            //System.out.println(matrix[in][jn]);
            if(target==matrix[in][jn]){
                
                 System.out.println("true");
                 break;
            }
            else if(target>matrix[in][jn])
            {
                low=mid+1;
                    
                }
                else high=mid-1;
            
            
        }
        if(high>low){
           System.out.println("false")
           
        }
    
            
            



  }
}

//leetcode solution
/*
 * class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols=matrix[0].length;
        int rows=matrix.length;
        int totalelements=rows*cols;
        int in=0;
        int jn=0;
        int low=0;
        int high=totalelements-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            //break mid into coordinates
            in=mid/cols;
                jn=mid%cols;
            //System.out.println(matrix[in][jn]);
            if(target==matrix[in][jn]){
                
                return true;
            }
            else if(target>matrix[in][jn])
            {
                low=mid+1;
                    
                }
                else high=mid-1;
            
            
        }
        if(high>low){
            return false;
        }
       return false;
            
 */
