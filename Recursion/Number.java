package Recursion;
import java.util.*;

public class Number {
    public static void Print(int n){
        //base condition
        if(n==5){
          System.out.println(n);//0
          
        }
        else{
         
    
     

        Print(n-1);
        System.out.println(n);//10,9,8,.....2,1
        Print(n-2);
       
   
        }
        
    }
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        Print(10);//10

    }
    
}
