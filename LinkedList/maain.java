package LinkedList;

public class maain extends CreateLinkedList {
    public maain() {
        super();
        //TODO Auto-generated constructor stub
    }

   
   


    public static void Task1(CreateLinkedList link3)
    {
        Nodeclass pointer1;
        Nodeclass pointer2;
        pointer1=link3.Head;
        pointer2=null;
        int count=0;
  
        
        while(pointer1.next!=null)
        {
            

          
            if(pointer1.data<pointer1.next.data){
                 //delete head
                if(count==0){
                    link3.Head=link3.Head.next;

                }
                   //delete from mid
                else{
                pointer2.next=pointer1.next;
                }


            }

            
          
            pointer2=pointer1;
            pointer1=pointer1.next;
            count++;
        }

    }


    public static void main(String[] args)   
    {
        //create linkedlist object
       
        CreateLinkedList link1=new CreateLinkedList();
        CreateList(new int[]{4,52,5,24,536,3525,6,24,114,424,522});
        ViewLinkedList();
        System.out.println(TellSize());
        
        CreateLinkedList link2=new CreateLinkedList();
        CreateList(new int[]{6,24,114,424,522,43,2,3,4,32});
        ViewLinkedList();
        System.out.println(TellSize());

        CreateLinkedList link3=new CreateLinkedList();
        CreateList(new int[]{5,6,7,9,6,2,7});
    
        System.out.println(TellSize());
        ViewLinkedList();


        Task1(link3);
        ViewLinkedList();



    }

    
}
