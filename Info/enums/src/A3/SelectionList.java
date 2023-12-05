package A3;

import java.util.ArrayList;

class selectionListException extends Exception {
    selectionListException(String cause) {
        super(cause);
    }
}

public class SelectionList<T> {
    private ArrayList<T> left;
    private ArrayList<T> right;

    public void addRight(T element) {
        right.add(element);
    }

    public void addLeft(T element) {
        left.add(element);
    }

    public void moveRight(T element) throws selectionListException {
        if (left.contains(element)) {
            right.add(element);
            left.remove(element);
        } else {
            throw new selectionListException("Element not found");
        }
    }

    public void moveLeft(T element) throws selectionListException {
        if (right.contains(element)) {
            left.add(element);
            right.remove(element);
        } else {
            throw new selectionListException("Element not found");
        }
    }

    public int getTotalCount() {
        return this.right.size() + this.left.size();
    }

    public SelectionList() {
        this.left = new ArrayList<>();
        this.right = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SelectionList{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
