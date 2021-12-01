package MyArray;

public class MyList implements MyArrayListImpl {
    private String[] array;
    private int size;
    private final int INITIAL_SIZE = 10;
    private boolean addEmptyCell;

    // check if the position in list range. returns true or false end print error
    private boolean checkPosition(int position) {
        if (position >= 0 && position <= size) {
            return true;
        } else {
            System.out.println("Out of bounds");
            return false;
        }
    }

    private void resize(int position) {
        String[] tempArray;

        if (size == array.length) {
            tempArray = new String[(array.length) * 2];
            System.arraycopy(array, 0, tempArray, 0, size);
            array = tempArray;
        } else {
            tempArray = new String[array.length];
        }

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
        if (checkPosition(position)) {
            resize(position);
            array[position] = string;
            size++;
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
        remove(indexOf(string));
    }

    @Override
    public void remove(int position) {
        if (checkPosition(position)) {
            addEmptyCell = false;
            resize(position);
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

        if (checkPosition(position)) {
            array[position] = string;
        } else {
            System.out.println("It’s not acceptable position");
        }
    }

    //search for string, in case not found ewturns -1 and print error
    @Override
    public int indexOf(String string) {

        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(string)) {
                return i;
            }
        }
        System.out.println("No such item in the list");
        return -1;
    }

    @Override
    public String get(int position) {
        if (checkPosition(position)) {
            return array[position];
        } else {
            return null;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    // As I understood my list inherits from Object, and its have method toString
    //which return some kind of the link. So  I override this and now sout(list) works.
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < size; i++) {
            string.append(array[i]).append(" ");
        }
        return string.toString();
    }

    public MyList() {
        array = new String[INITIAL_SIZE];
        size = 0;
    }
}