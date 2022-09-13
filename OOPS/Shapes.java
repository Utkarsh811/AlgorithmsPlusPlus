package OOPS;

public class Shapes {
   int sides;//instance variable
    double area;
    double perimeter;
    private int a;
    private int b;

    //how to create constructor
    public Shapes(int sid,double ar,double per)
    {
        this.sides=sid;
        this.area=ar;
        this.perimeter=per;

    }
    public Shapes(){ //constructor overloading
      

    }

 

    //end of constructor
    //methods
    public static void display(){
        System.out.println("hello how are you");
    }

    //Encapsulation methods
    //getters and setters
    public  void settermethod(int var1,int var2)
    {
        if(var1>18){
        this.a=var1;
        this.b=var2;
        }
        
    }
    public String gettermethod(){
    String str=String.format("the value of a is %s and value of b is %s", this.a,this.b);
        return str;
    }
    









    
}



