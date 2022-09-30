//miiidula


package mapHashMap;
import java.util.*;
//import java.util.Map.Entry;




public class code1 { 
    public static void main(String[] args){
    String name="merdilanwqlpjbfuwefhuierhfegu";
    HashMap<Character,Integer> dict=new HashMap<>(); 
    System.out.println(name);
    for(int i=0;i<name.length();i++)
    {
        char key=name.charAt(i);
        //System.out.println(key);
        if(dict.containsKey(key)){
            int value=dict.get(key);
            //System.out.println(value);
            dict.put(key,value+1);

        }
        else{
            dict.put(key,1);
        }


    }
    System.out.println(dict);
    for(Map.Entry<Character, Integer> var : dict.entrySet()){

        
        if(var.getValue()>1){
            System.out.println(var.getKey());
            
        }
    }

   

 

    }
    
    
    
    




    
}
