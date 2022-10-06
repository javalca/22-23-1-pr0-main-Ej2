package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

import java.util.ArrayList;
import java.util.List;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 9;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }


    public void fillStack() {
        for (int c = 0; c < 9; c++) {
            stack.push(c);
        }
    }

    public List<Integer> clearAllStack() {
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty())
            list.add(stack.pop());
        return list;
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }
}
