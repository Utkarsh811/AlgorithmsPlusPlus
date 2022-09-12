//leetcode 240. Search a 2D Matrix II

//package 2dmatrixsearch;
//2d matrix search when the
/*
 * 1.rows are sorted
 * 2. columns are sorted
 */

/*
  * 2 3 4
    5 6 7
    8 9 11
  */
import java.util.*;

class approach {

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
    System.out.println(matrix[0].length);
    System.out.println("Enter your target element");
    int target = sc.nextInt();

    //2D MATRIX SEARCH ALGORITHM
    int initial_row = 0;
    int initial_col = cols - 1;
    int access_point = matrix[initial_row][initial_col];
    try {
      //main algo
      while (access_point != target) {
        if (target > access_point) {
          initial_row = initial_row + 1;
          access_point = matrix[initial_row][initial_col];
        } else {
          initial_col = initial_col - 1;
          access_point = matrix[initial_row][initial_col];
        }
      }
      System.out.println("i=" + initial_row + "j=" + initial_col);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Element not found ");
    }
  }
}
