package mygereric_stack;

import static mygereric_stack.MyGenericStack.stackOfIStrings;
import static mygereric_stack.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
