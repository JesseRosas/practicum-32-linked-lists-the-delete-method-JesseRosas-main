// IntList Class to Complete
public class IntList {
  private IntNode head;

  public IntList() {
  // Inits as empty list
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  // ** TO COMPLETE **
  public void append(int new_value) {
    // Copy from Practicum 30

  // ** TO COMPLETE **
  public void delete(int value) throws NoSuchValueException,
                                       EmptyListException {
    // Check if list empty. If so, make first node.
    if(head == null)
      throw new EmplyListExceptino();

    // if not empty, delete value from linked list
    // if not in list, throw NoSuchValueException


    
  // Display Method
  public void displayList() {
    if(head == null) 
      System.out.println("* empty list * ");
    else {
      IntNode tempPtr = head;
      
      while(tempPtr != null) {
        System.out.println(tempPtr.getValue());
        tempPtr = tempPtr.getNext();
      }
    }
  }
}
}
}
