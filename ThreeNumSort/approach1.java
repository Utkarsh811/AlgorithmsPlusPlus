package ThreeNumSort;
/*Sort the 0,1,2 */
//Approach using counting sort
import java.util.*;

public class approach1 {
    public static void sort(int[] arr)
    {
        //making count array
        int[] countarr=new int[]{0,0,0};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                countarr[0]++;
            }
            else if(arr[i]==1)
            {
                countarr[1]++;
            }
            else{
                countarr[2]++;
            }

        }
        System.out.println(countarr[0]+","+countarr[1]+","+countarr[2]);
     
        for(int j=0;j<arr.length;j++)
        {
            if(j<countarr[0]){
                arr[j]=0;
            }
            else if(j<(countarr[0]+countarr[1]) && j>=countarr[0])
            {
                arr[j]=1;
            }
            else{
                arr[j]=2;
            }

        }
     

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{2,1,0,1,0,0,2,1,2,2,2,2,2,2,1,1,1,1,0,0,0,0};
        sort(arr);
        for(int k:arr)
        System.out.println(k);
      


    }
    
}
