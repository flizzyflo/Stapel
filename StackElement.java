
public class StackElement {
	
    // Data class", has only the respective values.
    // Stack class manages the pointers and order.

	private String elementValue;
    private StackElement nextStackElement;

    // constructor if only value is passed. Pointer shows null
    StackElement(String inputValue){
        this.elementValue = inputValue;
        this.nextStackElement = null;
    }

    // constructor if value and other stack element is passed. Pointer points to 
    // passed stack element

    StackElement(String inputValue, StackElement nextStackElement){
        this.elementValue = inputValue;
        this.nextStackElement = nextStackElement;
    }

    protected String getValue(){
        return this.elementValue;
    }

    protected StackElement getNextStackElement(){
        return this.nextStackElement;
    }
	
}