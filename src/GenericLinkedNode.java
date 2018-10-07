public class GenericLinkedNode<DATA> {

    private DATA value;
    GenericLinkedNode<DATA> next;

    public GenericLinkedNode(DATA value){

        this.value = value;
    }//end CircularLinkedNode(int _num)

    public DATA getValue(){

        return this.value;

    }//end getValue()

}//end GenericLinkedNode


