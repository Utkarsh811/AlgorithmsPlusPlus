package Problem1;
import java.util.*;

public class code1 {
    public static void func(int n,int k,int[] arr)
    {
        HashMap<Integer,Integer> dict=new HashMap<>(); 
        for(int i=0;i<arr.length;i++)
    {
        int key=arr[i];
        //System.out.println(key);
        if(dict.containsKey(key))
        {
            int value=dict.get(key);
           
            dict.put(key,value+1);

        }
        else{
            dict.put(key,1);
        }
    }System.out.println(dict);
    ArrayList<Integer>lst=new ArrayList<>();
  
    for(Map.Entry<Integer,Integer> variable:dict.entrySet()){
        //System.out.println(variable);//contains key value pair
        //System.out.println(variable.getKey());

         //System.out.println(variable.getValue());
         lst.add(variable.getValue());

    }
    //System.out.println(lst);
    lst.sort(Collections.reverseOrder());
   System.out.println(lst);
    int sum=0;
    int count=0;
    for(int i=0;i<lst.size();i++)
    {
        sum=sum+lst.get(i);
        count++;
        if(sum>=k)
        {
            System.out.println(count);
            break;
        }
        
    }

        
    




    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int k=6;
        int[] arr=new int[]{5,3,22,22,22,4,5,5,5,5,5,9,9,9,2,1};
        func(n,k,arr);


    }
    
}
