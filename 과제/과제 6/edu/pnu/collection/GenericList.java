package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(Object obj) {
        data[size] = obj;
        size++;
        return;
    }

    public void removeAll() {
        size = 0;
        return;
    }

    public T findStudent(T target) {
        for (int i=0; i<size; i++) {
            T current = (T)data[i];
            if (target.hashCode() == current.hashCode()) {
                return current;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i=0; i<size; i++) {
            T current = (T)data[i];
            ret += current.toString() + String.format("\n");
        }
        return ret;
    }
}
