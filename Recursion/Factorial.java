// 0!=1
//n!=n*(n-1)!
//4!=4*3*2*1
//4!=4*(4-1)!
//3!=3*(3-1)!
package Recursion;
import java.util.*;
class Factorial{
    public static int Fact(int input)//function definition
    {
        int result=1;
        if(input==0)//base condition
        {
            return result;
        }
        else{
          result=input*Fact(input-1);//fact(3)
        }
        return result;

       
    }
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println(Fact(input)); //calling function
        sc.close();

    }
}





