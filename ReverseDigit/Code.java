package ReverseDigit;
import java.util.*;

public class Code {
    public static int reverse(int num){
        String revnum="";
        int rem;
        while(num>0){
           //rem=num%10;// getting last digit everytime
            revnum=revnum+String.valueOf(num%10);//int to string
            num=num/10; //making number smaller

        }
        return Integer.valueOf(revnum);//string to int
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(reverse(num));
    }
    
}
