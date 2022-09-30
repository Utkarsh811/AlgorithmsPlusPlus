package ArraySubtraction;
import java.util.*;

public class code {
    public static ArrayList subtract(int[] arr1,int[] arr2)
    {
        ArrayList<Integer> result_arr=new ArrayList<Integer>();
        //approach
        //sort 2nd array
    
       Arrays.sort(arr2); //nlogn
      

       for(int i=0;i<arr1.length;i++)   //n
       {
           int key=arr1[i];
              // binary search the element
              int low=0;
              int high=arr2.length-1;
              boolean flag=false;
              while(low<=high)       //log n
              {
                  int mid=low+(high-low)/2;
                  if(key==arr2[mid]){
                      flag=true;
                      break;
                  }
                  else if(key>arr2[mid]){
                      low=mid+1;
                  }
                  else{
                      high=mid-1;
                  }
              }
              if(flag){
                  continue;
              }
              else{
                  result_arr.add(key);
              }

       }



        return result_arr; //nlogn +nlogn = 2nlogn

    }
    public static void main(String[] args)
    {
        int[] arr1=new int[]{2,1,11,3,9,10};
        int[] arr2=new int[]{2,1,3,9,10};
        System.out.println(subtract(arr1,arr2));
    }
    
}
