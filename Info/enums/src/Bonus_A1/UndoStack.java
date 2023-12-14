package Bonus_A1;
import java.util.Stack;

public class UndoStack<T extends FileAction> {

    Stack<T> myStack;
    T lastOne;

    public UndoStack() {
        this.myStack = new Stack<>();
    }

    public void add(T action){
        System.out.println("\nAdding Action to Stack!");
        action.execute();
        myStack.add(action);
    }
    public void undo(){
        System.out.println("\nUndoing Action!");
        lastOne = myStack.lastElement();
        System.out.println(lastOne.getPath());
        myStack.remove(myStack.size()-1);

    }
    public void redo(){
        System.out.println("\nRedoing Action!");
        if(lastOne == null) System.exit(1);
        System.out.println(lastOne.getPath());
        myStack.add(lastOne);
        lastOne = null;
    }
    public void printAction(){
        System.out.println("\nPrinting Actions!");
        for(T action: myStack){
            System.out.println("Action: " + action.getPath() + " : ");
            action.execute();
        }
        System.out.println();
    }
}
