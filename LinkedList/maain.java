package LinkedList;

public class maain extends CreateLinkedList {
    public maain() {
        super();
        //TODO Auto-generated constructor stub
    }

    public static void Task1(CreateLinkedList link3)
    {
        Nodeclass pointer1;
        pointer1=link3.Head;
        
        while(pointer1!=null)
        {
            System.out.println(pointer1.data);
            pointer1=pointer1.next;
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
        CreateList(new int[]{9,2,32,53,22,42,19,76});
        ViewLinkedList();
        System.out.println(TellSize());


        Task1(link3);



    }

    
}
