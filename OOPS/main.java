package OOPS;
import java.util.*;

public class main {
    public static void main(String[] args)// main function
    {
        //creating object or instance
  
        Shapes rectangle=new Shapes(4,23.45,98.76);//constructor
        //It is called when an instance of the class is created
        //It is a special type of method which is used to initialize the object.
        System.out.println(rectangle.perimeter);


        Shapes square=new Shapes(4,10.96,234.87);
        Shapes Triangle =new Shapes(3,123.34,89.64);
        System.out.println(Triangle.sides);

        //Encapsulation
        Shapes obj1=new Shapes();
    obj1.settermethod(23,78);
    System.out.println(obj1.gettermethod());

    //Inheritance
    Child2 chid2=new Child2();
    System.out.println(chid2.a);








      

        






    }
    
}
