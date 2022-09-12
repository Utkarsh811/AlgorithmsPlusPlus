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

  }
}
