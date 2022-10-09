//using sieve of eratotesthenes we can calculate all the prime numbers upto n very easily
package PRIMES;
import java.util.*;

public class countprimes {
   
    public static void main(String[] args){
        int a=5;
        int b=10;
        

    }
}
    

    




/*package PRIMES;
import java.util.*;

public class countprimes {
    public static void Countprime(int number)
    {
        int[] arrprime=new int[number];
        //0&1 are not prime so start from 2
        for(int i=2;i<number;i++)
        {
            int num=i;
            if(num*num>number){
                break;
            }
            else{
                for(int j=num*num;j<number;j+=num){
                    //make the place as 1 which is not prime
                    arrprime[j]=1;

                }
            }
        }
        for(int k=2;k<number;k++)
        {
            if(arrprime[k]==0)
            System.out.print(k+" ");

        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till you want the prime numbers");
        int number=sc.nextInt();
        Countprime(number);
        sc.close();
        
    }

    
}
 */
