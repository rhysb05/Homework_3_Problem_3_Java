public class GenericLinkedList <DATA> {


        public int size = 0;
        public GenericLinkedNode<DATA> head = null;
        public GenericLinkedNode<DATA> tail = null;

        //Add a node at the beginning of the linked list
        public void insertNodeAtBegin(DATA _value){

            //Create new node containing the appropriate integer
            GenericLinkedNode<DATA> newNode = new GenericLinkedNode<DATA>(_value);

            if (size == 0){

                head = newNode;
                tail = newNode;
                newNode.next = head;
            }//if (size ==0)

            else{
                GenericLinkedNode temp = head;
                newNode.next = temp;
                head = newNode;
                tail.next = head;
            }//else

            //Increment the size of the list
            ++size;

        }//end insertNodeAtBegin

        public void insertNodeAtEnd(DATA _value){

            if(size == 0){

                insertNodeAtBegin(_value);

            }//end if (size == 0)

            else{
                //Create new node
                GenericLinkedNode<DATA> newNode = new GenericLinkedNode<DATA>(_value);
                //Assign the tail pointer to the new node
                tail.next = newNode;
                //Make the newly created node the tail node
                tail = newNode;
                //Make the new tail node point to the head of the list
                tail.next = head;

                //Increment the size of the list
                ++size;

                System.out.println("Node has been added at the end");
            }//end else
        }//end insertNodeAtEnd(int _num)

    //This function inserts an element at the index position requested by the user.
    public int insertAtElement(int _index, DATA _value){

        int feedBack = _index;

        //If the index entered is past the limit of the list
        if((_index +1 ) > size){

            System.out.println("That index position is past the end of the list");

        }//if ((index -1) > size)

        //Set the cursor node to the position of the head node.
        GenericLinkedNode<DATA> cursorNode = head;

        //If the index position is 0.
        if(_index == 0){

            insertNodeAtBegin(_value);

            return 0;

        }//end if (_index == 0)
        while ((_index - 3) > -1){

            //Move the cursor to the next node
            cursorNode = cursorNode.next;
            //Decrease the index until it reaches 0
            --_index;

        }//end while (_index -1 != 0)

        //Create new node to be inserted into the list
        GenericLinkedNode<DATA> insertNode = new GenericLinkedNode<DATA>(_value);

        //Set the next variable of the node to be inserted to the appropriate node.
        insertNode.next = cursorNode.next.next;

        //Ensure that the node before the newly inserted node is pointing to our newly
        //inserted node.
        cursorNode.next.next = insertNode;


        //Increment the size of the list
        ++size;

        System.out.println("Node has been added at position: " + feedBack + " with a value of: " + _value);

        return 0;

    }//end insertAtIndexPos(int index)

        public DATA getElementAt(int _index){

            //If the index entered is past the limit of the list
            if((_index +1 ) > size){

                System.out.println("That index position is past the end of the list");
                return null;

            }//if ((index -1) > size)
            GenericLinkedNode<DATA> newNode = head;
            while ((_index -1) != -1){

                //Move the cursor to the next node
                newNode = newNode.next;
                //Decrease the index until it reaches 0
                --_index;

            }//end while (_index -1 != 0)

            return newNode.value;

        }//end insertAtIndexPos(int index)

        //This function prints the contents of the linked list
        //from beginning to end.
        public void printLinkedList(){

            //Create a node to act as a cursor
            GenericLinkedNode<DATA> cursorNode = head;

            //If the list is empty
            if (size <= 0){

                System.out.println("The list is empty, silly!");

            }//if (size <= 0)
            else {
                for(int i = 0; i < getSize(); ++i){

                    System.out.print(cursorNode.value + "\n");
                    cursorNode = cursorNode.next;

                }//end for (int i = size; i < size; ++i)
            }//end else

            System.out.print("\n");

        }//end printLinkedList

        //Function that gets the size of the list.
        public int getSize(){

            return this.size;

        }//end getSize()

    //This function shifts all the elements in the list by one.
    public void shiftByOneCounterClockwise(){
        //Shift the head and tail pointer over. This shifts the index
        //of every element in the list.

        head = head.next;

    }//end shiftByOn()

    //This function shifts all the elements in the list by one.
    public void shiftByOneClockwise(){
        //Declare a node that is the head

        //Shift the head and tail pointer over. This shifts the index
        //of every element in the list.
        for(int i = 0; i < size - 1; ++i) {

            head = head.next;

        }//end for(int i = 0; i < size; ++i)
    }//end shiftByOne()

}//end GenericCircularList
