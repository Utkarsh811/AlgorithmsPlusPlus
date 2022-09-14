
//HCF IS THE GREATEST COMMON FACTOR AMONG THE FACTOR OF A 2 OR MORE NUMBERS
/*
WE USE HCF TO SIMPLEFY FRACTIONS
Relation 3: H.C.F. and L.C.M. of Fractions


= LCM of fractions= LCM of numerators/  (GCD/HCF of denominators)


= HCF of numerators =HCF of fractions / LCM of denominators

 */ 
//HCF *LCM=PRODUCT OF THE NUMBERS

package GCDandLCM;
import java.util.*;

public class hcf {
    public static int FindGCD(int a,int b)
    {
       
        int rem=-32321;
        while(rem!=0)
        {
            rem=b%a;
            b=a;
            a=rem;
        }
        return b;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers-:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=FindGCD(a,b);
        //Lcm calculation
        //lcm*hcf=product  of numbers
        System.out.println(result);
        
        int lcm=(a*b)/result;
        System.out.println(lcm);


    }
    
}
