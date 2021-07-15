package labs_examples.datastructures.queue.labs;

import java.util.Arrays;

public class TorinsCustomQueue<T> {


    int size = 0;


    private static final int DEFAULT_CAPACITY = 10;
    T[] data = (T[]) new Object[DEFAULT_CAPACITY];

    public int size() {
        return size;
    }


    public void add(T t) {
        data[size++] = t;
        resize();
    }

    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("Empty Queue");
        } else {
            T t = data[0];
            for (int i = 0; i < size; i++) {
                data[i] = data[1 + i];
            }
            data[size] = null;
            size--;
            resize();
            return t;
        }

    }

    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
            size = 0;
        }
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
        int count = 1;

        for (int i = 0; i < size(); i++) {
            System.out.println(data[i]);
            ;
            count++;
        }
    }

    public T peakFirst() {
        return data[0];
    }

    public T peakLast() {
        return data[size - 1];
    }

    public int length() {
        return data.length;
    }
}
