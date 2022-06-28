
public class Stack {

    /* 
    Stack is LIFO structure. Element that comes in last goes out first.
    Stack points to the top element. Stack elements themselves have pointer to 
    the next element. 
    Stack class manages the pointers.
    */

    private StackElement firstElement;
    private StackElement oldFirstElement;
    private long sizeCounter;

    /*
    Constructor of the stack if no initial stack element is specified. Then the stack is empty.
    */ 

    Stack(){
        this.firstElement = null;
        this.sizeCounter = 0;
    };

    /*
    Constructor of the stack when initial stack element is specified. Stack consists of one element, which is also
    the first element.
    */ 
	Stack(StackElement firstElement){
        this.firstElement = firstElement;
        this.sizeCounter = 1;
    };


    void addElement(String s){

        /*
         Special case: stack has no element. New stack element added as the first element on the stack. 
         New stack element points to zero; no other element in the stack.
        */ 

        if (this.firstElement == null){
            this.firstElement = new StackElement(s);
        }
        else{
            /* 
            the old first element is saved. new, topmost element is created and 
            the old first element is passed to the stack element constructor. this way order is maintained.
            */ 

            oldFirstElement = this.firstElement;
            this.firstElement = new StackElement(s, oldFirstElement);
        };

        // increase stack size by 1.
        this.sizeCounter ++;
        
    };
    

    // removes the stack element that was added last and returns it
    String removeFirstElement(){

        // If stack is already empty, then hint is returned that stack is null.
        if (this.firstElement == null){
            return null;
        }
        else{
            // current top value of the stack is temporarily stored before return.
            String value = this.getFirstElement();
            /*
            The new First element is the stack element to which the pointer of the now returned 
            first element pointed to before. Pointers are reassigned accordingly.
            */ 
            this.firstElement = this.firstElement.getNextStackElement();

            // Decrease the current stack size by one.
            this.sizeCounter --;
            return value;
        }
    };      
    
    
    // Return the top value of the stack without removing it.
    String getFirstElement(){

        if (this.firstElement == null){
            return null;
        }
        else{
            return this.firstElement.getValue();
        }
    };


    // Returns the "height" of the stack, i.e. the number of stored values.
    long getSize(){
        return this.sizeCounter;
    };                       
    

    /*
    If the first element is null, then the stack is empty, accordingly false is returned. Otherwise true.
    */
    boolean isEmpty(){
        return (this.firstElement == null);
    };

};