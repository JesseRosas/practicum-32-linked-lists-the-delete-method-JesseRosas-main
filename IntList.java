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
  public void append(Integer new_value) {
    IntNode n = new IntNode(new_value, null); // Create a new node with null next pointer
  
    if (head == null) {
      head = n; // If list is empty, make the new node the head
    } else {
      IntNode tempPtr = head;
      while (tempPtr.getNext() != null) {
        tempPtr = tempPtr.getNext();
      }
      tempPtr.setNext(n); // Set the next pointer of the last node to the new node
    }
  }

  // ** TO COMPLETE **
  public void delete(int value) throws NoSuchValueException, EmptyListException {
    if (head == null) {
      throw new EmptyListException();
    }

    // Case 1: Deleting the head node
    if (head.getValue() == value) {
      head = head.getNext();
      return;
    }


    
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
