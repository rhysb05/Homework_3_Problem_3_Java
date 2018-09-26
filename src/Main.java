public class Main {
    public static void main(String[] args){
        GenericLinkedList<String> myList = new GenericLinkedList<String>();

        //Insert five elements into the list.
        myList.insertNodeAtEnd("Hello");
        myList.insertNodeAtEnd("Goodbye");
        myList.insertNodeAtEnd("Ciao");
        myList.insertNodeAtEnd("Later");
        myList.insertNodeAtEnd("Peace");

        //Print the current list.
        myList.printLinkedList();

        //Add an element at index position 4 to the list.
        myList.insertAtElement(4, "L8T3R");

        //Print current list.
        myList.printLinkedList();

        //Shift the list by one in the CounterClockWise direction
        myList.shiftByOneCounterClockwise();
        System.out.println("We have rotated all elements in the list by one in the counter clockwise direction.");

        //Print current list.
        myList.printLinkedList();

        //Shift the list by one in the clockwise direction.
        //The list should now be in it's original configuration.
        myList.shiftByOneClockwise();
        System.out.println("We have rotated all elements in the list by one in the clockwise direction.");

        //Print current list.
        myList.printLinkedList();

    }//end void main()

}//end Main
