
//QUES LINK -:https://www.codechef.com/submit/REMOVECARDS
package CardRemoval;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections; 
import java.util.Comparator; 
import java.util.HashMap; 
import java.util.LinkedHashMap; 
import java.util.Map;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;


class code1
{
    public static int output(int[] arr,int size)
    {
        ArrayList<Integer> nrr=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                int value=mp.get(arr[i]);
                mp.put(arr[i],value+1);
                
            }
            else{
                mp.put(arr[i],1);
            }
        }
       // System.out.println(mp);
        if(mp.size()==1)
        {
            return 0;
        }
        else if(mp.size()==arr.length)
        {
            return arr.length-1;
        }
        else{
           LinkedHashMap<Integer, Integer> sorted = mp.entrySet().stream().sorted(comparingByValue()).collect( toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
           /*Above line is a classic example of how to sort the hashmap on ythe basis of values */
           //System.out.println(sorted);
           int sum=0;
           int lastvalue=0;
           for(Map.Entry<Integer,Integer> vr:sorted.entrySet())
           {
               lastvalue=vr.getValue();
               sum=sum+vr.getValue();
           }
           return sum-lastvalue;
           

        }
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int size=sc.nextInt();
		    int[] arr=new int[size];
		    for(int j=0;j<size;j++)
		    {
		        arr[j]=sc.nextInt();
		    }
		    System.out.println(output(arr,size));
		}
	}
}
