package MyArray;

public class MyList implements MyArrayListImpl {
    private String[] array;
    private String[] tempArray;
    private int size;
    private final int INITIAL_SIZE = 10;
    private boolean addEmptyCell;

    /* called by methods add or remove to check if the capacity of array enough to
     store list data. if quantity of elements in list equals to array.length
     its increase array to two of its actual size. in case when size of the list
     is twice smaller than array, decrease array in two times*/
    private void changeSize() {
        if (size == array.length) {
            tempArray = new String[(array.length) * 2];
            System.arraycopy(array, 0, tempArray, 0, size);
            array = tempArray;
        } else if (size * 2 < array.length && array.length > 10) {
            tempArray = new String[(array.length) / 2];
            System.arraycopy(array, 0, tempArray, 0, size);
        } else {
            tempArray = new String[array.length];
        }
    }

    // check if the position in list range. returns true or false end print error
    private boolean check(int position) {
        if (position >= 0 && position <= size) {
            return true;
        } else {
            System.out.println("Out of bounds");
            return false;
        }
    }

    /*called by add or remove methods, takes int position to remove or add empty cell in
    position, check flag addEmptyCell in case true add empty cell in position, in another case
     remove list item at difined position*/
    private void copy(int position) {
        if (addEmptyCell) {
            if (position == 0) {
                System.arraycopy(array, 0, tempArray, 1, size);
            } else {
                System.arraycopy(array, 0, tempArray, 0, position);
                System.arraycopy(array, position, tempArray, position + 1, size - position);
            }
        } else {
            if (position == 0) {
                System.arraycopy(array, 1, tempArray, 0, size - 1);
            } else {
                System.arraycopy(array, 0, tempArray, 0, position);
                System.arraycopy(array, position + 1, tempArray, position, size - position);
            }
        }
        array = tempArray;
    }

    @Override
    public void add(String string) {
        add(string, size);
    }

    @Override
    public void add(String string, int position) {
        if (check(position)) {
            changeSize();
            if (position == size) {
                array[size] = string;
                size++;
            } else {
                addEmptyCell = true;
                copy(position);
                array[position] = string;
                size++;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    /*check availability of the string in list, in case true calls remove method with position
    of string*/
    @Override
    public void remove(String string) {
        if (indexOf(string) != -1) {
            remove(indexOf(string));
        }
    }

    @Override
    public void remove(int position) {
        if (check(position)) {
            changeSize();
            addEmptyCell = false;
            copy(position);
            size--;
        }
    }

    //reset size counter to zero, and relink array to new with initial size
    @Override
    public void clear() {
        array = new String[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void set(String string, int position) {
        array[position] = string;
    }

    //search for string, in case not found ewturns -1 and print error
    @Override
    public int indexOf(String string) {

        for (int i = 0; i < size; i++) {
            if (array[i].equals(string)) {
                return i;
            }
        }
        System.out.println("No such item in the list");
        return -1;
    }

    @Override
    public String get(int position) {
        check(position);
        return array[position];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public MyList() {
        array = new String[INITIAL_SIZE];
        size = 0;
    }
}
