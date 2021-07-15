package labs_examples.datastructures.stack.labs;


import java.util.Arrays;

public class TorinsCustomStack<T> {

    int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    T[] data = (T[]) new Object[DEFAULT_CAPACITY];

    public int size() {
        return size;
    }


    public void push(T t) {

        data[size++] = t;
        resize();

    }

    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("Empty Stack");
        } else {
            T t = data[--size];
            data[size] = null;
            resize();
            return t;

        }


    }

    public void resize() {
        if (size >= data.length * .75) {
            int upSize = data.length * 2;
            data = Arrays.copyOf(data, upSize);
        }
        if (size <= data.length * .25) {
            if(size < 10){
                return;
            }
            int downSize = data.length / 2;
            data = Arrays.copyOf(data, downSize);
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(data[i].toString());
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public void print() {
        int count = 1;
        int size = size();
        int place = size;

        for (int i = 0; i < size(); i++) {
            System.out.println(data[i] + " " + "is " + place + " " + "away from the top of the stack.");
            ;
            count++;
            place = size - count;
        }
    }

    public T peakFirst() {
        return data[0];
    }

    public T peakLast() {
        return data[size - 1];
    }


}
