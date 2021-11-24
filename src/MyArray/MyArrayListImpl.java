package MyArray;

import javax.management.ObjectName;

public interface MyArrayListImpl {
    void add(String string);

    void add(String string, int position);

    int size();

    void remove(String string);

    void remove(int position);

    void clear();

    void set(String string, int position);

    int indexOf(String string);

    String get(int pos);

}
