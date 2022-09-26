package BASICDETAILS;
class finalkeyword{
    public static void main(String[] args)
    {
        //final keyword is used before variable,methods and class
        //final var as constant
        //final method cannot be method overriding
        //final class cannot be inherited
       
        try{
            final int var1=34;
            //var1=23; error
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}