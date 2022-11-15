package Heapps;
import java.util.*;
public class heapsort{
    public static void funcheapsort(int[] arr)
    {
        int[] qrr=new int[arr.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);

        }
        System.out.println(pq);
        for(int i=0;i<arr.length;i++)
        {
            int a=pq.poll();
            qrr[i]=a;
            

           
           
        }
        for(int s:qrr)
        {
            System.out.println(s);
        }

    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        funcheapsort(arr);


    }
}