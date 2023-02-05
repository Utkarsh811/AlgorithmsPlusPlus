package XOR;

public class xor1 {
    public static void main(String[] args)
    {
        int[] arr={8,8,8};
        int xrr=0;
        for(int a:arr)
        {
            System.out.println(xrr+"="+xrr+"^"+a);
            xrr=xrr^a;
        

        }
        System.out.println(xrr);
    }
    
}
// if array contain single digit repitition
//odd ->element aega vhi  even-> 0 aega
