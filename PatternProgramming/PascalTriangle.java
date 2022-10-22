package PatternProgramming;
import java.util.*;

public class PascalTriangle {

    public static int factorialresult(int n,int r,int diff)
    {
        //System.out.println(n+","+r+","+diff);
        int[] arr=new int[]{n,r,diff};
        for(int i=0;i<arr.length;i++)
        {
            int result=1;
            if(arr[i]==0 || arr[i]==1)
            {
                result=1;
            }
            else{
            for(int j=arr[i];j>=1;j--)
            {
                result=result*j;

            }}
        
            arr[i]=result;
        }
        
        
        



       
        return arr[0]/(arr[1]*arr[2]);

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
                // if(i==rows-1)
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
