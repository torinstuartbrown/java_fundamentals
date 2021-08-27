package labs_examples.datastructures.queue.labs;

import java.util.Arrays;

public class TorinsCustomQueue<T> {

    int size = 0;

    //not used but think i was supposed to
    int first = 0;
    int last = 0;

    private static final int DEFAULT_CAPACITY = 10;
    T[] data = (T[]) new Object[DEFAULT_CAPACITY];

    public int size() {
        return size;
    }


    public void add(T t) {
        data[last++] = t;
        size++;
        resize();
    }


    //reindexing the entire queue during pops cant be the most efficient way
    //i should be tracking the "Front" so that i can pop only data[front] then
    //increment "front" but this
    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("Empty Queue");
        } else {
            T t = data[first];
            data[first]= null;
            first++;
            size--;
            if(first > 4) {
                int itr = first;
                for (int i = 0; i < data.length; i++) {
                    if(itr < data.length) {
                        data[i] = data[itr++];
                    }
                }
                first = 0;
            }
            resize();
            return t;



        }
    }

    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
            size = 0;
        }
        first = 0;
        last = 0;
    }

    public void resize() {
        if (size >= data.length * .75) {
            int upSize = data.length * 2;
            data = Arrays.copyOf(data, upSize);
            System.out.println("Queue Upsized to " + data.length);
        }
        if (size <= data.length * .25) {
            if (data.length <= 10) {
                return;
            }
            int downSize = data.length / 2;
            data = Arrays.copyOf(data, downSize);
            System.out.println("Queue Downsized to " + data.length);
        }
    }

    public void print() {

        for (int i = first; i < last; i++) {
            if(data[i] != null){
                System.out.println(data[i]);
            }
        }
    }

    public T peakFirst() {
        return data[first];
    }

    public T peakLast() {
        return data[last - 1];
    }

    public int length() {
        return data.length;
    }
}
