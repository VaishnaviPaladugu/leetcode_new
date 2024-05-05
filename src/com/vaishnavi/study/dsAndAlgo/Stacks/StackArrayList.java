package com.vaishnavi.study.dsAndAlgo.Stacks;
import java.util.ArrayList;

public class StackArrayList<T> {
    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T obj) {
        stackList.add(obj);
    }
    public T pop() {
        if(isEmpty()) {
            return null;
        }
        T obj = peek();
        int index = size() - 1;
        stackList.remove(index);
        System.out.println("size" + size());
        return obj;
    }
}
