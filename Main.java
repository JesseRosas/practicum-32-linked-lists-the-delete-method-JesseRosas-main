class Main {
  public static void main(String[] args) {
    
    // Create a new, empty linked list
    nums_list = new nums_list;

    // Append values to list
    nums_list.append(10);
    nums_list.append(20);
    nums_list.append(30);
    nums_list.append(40);

    // Test 1
    System.out.println("Expected output: 10 20 30 40");
    nums_list.displayList();
    System.out.println();

    // Test 2
    nums_list.delete(30);
    System.out.println("Expected output: 10 20 40");
    nums_list.displayList();
    System.out.println();

    // Test 3
    nums_list.delete(10);
    System.out.println("Expected output: 20 40");
    nums_list.displayList();
    System.out.println();

    // Test 4
    nums_list.delete(20);
    nums_list.delete(40);
    System.out.println("Expected output: * empty list *");
    nums_list.displayList();
  }

}
