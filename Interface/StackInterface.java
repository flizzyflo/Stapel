package Interface;

public interface StackInterface {


    // adds element to the stack. places the element on top of the stack.
    void addElement(String s);

    // removes the stack element that was added last and returns it
    String removeFirstElement();

    // Return the top value of the stack without removing it.
    String getFirstElement();

    // Returns the "height" of the stack, i.e. the number of stored values.
    long getSize();


    //If the first element is null, then the stack is empty, accordingly false is returned. Otherwise true.
    boolean isEmpty();

}
