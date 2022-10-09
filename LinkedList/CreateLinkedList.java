package LinkedList;

public class CreateLinkedList {

  static Nodeclass Head;
 static Nodeclass pointer;
  static int size;

  //Constructor
  public CreateLinkedList() {
      size=0;
      Head=null;
      pointer=null;
      
    
  }
  public static void CreateList(int[] arr)
  {
    for (int i = 0; i < arr.length; i++) {
        Nodeclass node = new Nodeclass(arr[i]);
        if (size == 0) {
          Head = node;
          pointer = node;
        } else {
          pointer.next = node;
          pointer = node;
        }
        size++;
      }

  }

  //method1 To view the LinkedList
  public static void ViewLinkedList() 
  {
    Nodeclass ViewPointer;
    ViewPointer = Head;
    while (ViewPointer != null) {
      if (ViewPointer.next == null) {
        System.out.println(ViewPointer.data);
        break;
      }
      System.out.print(ViewPointer.data + "->");
      ViewPointer = ViewPointer.next;
    }
  }

  //method2 To find the size of the LinkedList
  public static String TellSize(){
      String str=String.format("The LinkedList size is %d",size);
      return str;

  }
}
