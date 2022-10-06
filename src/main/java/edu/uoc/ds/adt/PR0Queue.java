package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

import java.util.ArrayList;
import java.util.List;

public class PR0Queue {

    public final int CAPACITY = 9;

    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        for (int c = 0; c < 9; c++) {
            queue.add(c);
        }
    }


    public List<Integer> clearFullQueue() {
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

}
