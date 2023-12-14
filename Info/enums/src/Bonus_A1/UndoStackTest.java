package Bonus_A1;

public class UndoStackTest {

        public static void main(String[] args) {
            UndoStack<FileAction> fileActionUndoStack = new UndoStack<>();
            fileActionUndoStack.add(new ReadFile("Test.txt"));
            fileActionUndoStack.add(new WriteFile("Test.txt"));
            fileActionUndoStack.add(new DeleteFile("Test.txt"));
            fileActionUndoStack.printAction();
            fileActionUndoStack.undo();
            fileActionUndoStack.printAction();
            fileActionUndoStack.redo();
            fileActionUndoStack.printAction();
        }
}
