
// Java – First Problem Statement
// Question
// Write main method in the Solution class.
// In the main method, read an integer value and print "TRUE" if it contains at least 3 even digits. Else it 
// should print "FALSE".
// For example, if the value is 123456 and it contains 3 even digits such as 2,4,6. So it should print "TRUE".
// The output should be in the format of sample output.
// Sample input1:
// 123456
// Output:
// TRUE
// Sample input2:
// 123
// Output:
// FALSE

package TCSIAP_JAVA;
import java.util.*;

public class Tcs1{
    public static boolean count3even(int number)
    {
        int count=0;
        while(number>0){
            int dig=number%10;
            if(dig%2==0 ){
                count++;
                if(count>2){
                    return true;
                }
            }
            number=number/10;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(count3even(number));


    }

}