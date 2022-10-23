package PatternProgramming;
import java.util.*;

public class PascalTriangle {
    /*Although this method could not handle higher values as datatypw fails to store the values 
     * Watch part2 to  understand the better solution and approach
     */

    public static int factorialresult(int n,int r,int diff)
    {
        //System.out.println(n+","+r+","+diff);
        long[] arr=new long[]{n,r,diff};
        for(int i=0;i<arr.length;i++)
        {
            long result=1;
            long val=arr[i];
            if(val==0 || val==1)
            {
                result=1;
            }
            else{
            for(long j=1;j<=val;j++)
            {
                result=result*j;

            }}
        
            arr[i]=result;
        }
      
        



       
        return (int)(arr[0]/(arr[1]*arr[2]));

    }
    public static void Pascal(int rows)
    {
        for(int i=0;i<rows;i++)
        {
            int row1=i;
            for(int j=0;j<=i;j++)
            {
                int col1=j;
                //prforming nCr =n!/n-r!*r*
                //3 parameters n! n-r ! r!
                //factorial calculation
                int n=row1;

                int r=col1;
                int diff=n-r;
                // if(i==rows-2)
                // {
                //     System.out.println(n+","+r+","+diff);
                // }
                int val=factorialresult(n,r,diff);
             



                System.out.print(val+" ");
                

            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();

    Pascal(rows);
    }

    
}
