package PatternProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Part1 {

  public static void pattern(int n) {
    int length = n;
    int breadth = 3 * n + 2;
    // create rectangle
    for (int i = 0; i < length; i++) {
      int p1 = i + 1;
      int p2 = breadth - (i + 2);
      for (int j = 0; j < breadth; j++) {
        if (i == length - 1) {
          if (j >= p1 && j <= p2) {
            System.out.print("*");
          } else {
            System.out.print("@");
          }
        } else {
          if (j >= p1 && j <= p2) {
            System.out.print(" ");
          } else System.out.print("@");
        }
      }

      System.out.println();
    }
  }

  public static void main(String[] args) throws IOException {
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);
    int n = Integer.parseInt(br.readLine());
    System.out.println(n);
    if (n % 2 != 0 && n >= 3) {
      pattern(n);
    }
  }
}
