package PatternProgramming;
import java.util.*;

public class PascalTriangle1 {
 
    public static void Pascal1(int rows)
    {
        
        for(int i=0;i<rows;i++)
        {
          
            int  ncprev=1;
            
            for(int j=0;j<=i;j++)
            {
               
              
                System.out.print(ncprev+" ");
               

              
                int factor=(i-j)/(j+1);
                int ncprevplus1=(ncprev*(i-j))/(j+1);
                ncprev=ncprevplus1;
                // if(i==2 && j==1)
                // {
                //     System.out.println(i+","+j+","+ncprevplus1);
                // }
                
          
                

            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();

    Pascal1(rows);
    }

    
}


/*
 * LEETCODE ACCEPTED SOLUTION
 * class Solution {
    public static int calculate(int n,int r,int prev)
    {
        int next=((prev*(n-r))/(r+1));
        return next;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> arr=new ArrayList<>();
            int value=1;
            for(int j=0;j<=i;j++)
            {
                arr.add(value);
                int val=calculate(i,j,value);
                value=val;

            }
            matrix.add(arr);
        }
        return matrix;

        
    }
}
 */
