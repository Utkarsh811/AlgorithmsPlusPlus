package ThreeNumSort;

import java.util.*;

//Approach using 3 pointer also known as Dutch national flag algorithm

public class approach2 {

  public static void swap(int[] nums, int a, int b) {
    //swap
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }

  public static void sort(int[] nums) {
    int low = 0;
    int mid = 0;
    int high = nums.length - 1;
    while (mid <= high) {
      switch (nums[mid]) {
        case 0:
          {
            swap(nums, low, mid);
            low++;
            mid++;
            break;
          }
        case 1:
          {
            mid++;
            break;
          }
        case 2:
          {
            swap(nums, mid, high);
            high--;
            break;
          }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[] {
      2,
      1,
      0,
      1,
      0,
      0,
      2,
      1,
      2,
      2,
      2,
      2,
      2,
      2,
      1,
      1,
      1,
      1,
      0,
      0,
      0,
      0,
    };
    sort(arr);
    for (int k : arr) System.out.println(k);
  }
}
