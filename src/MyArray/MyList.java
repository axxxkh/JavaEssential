package MyArray;

public class MyList implements MyArrayListImpl {
    private String[] array;
    private String[] tempArray;

    private void decrease() {
        tempArray = new String[array.length - 1];
    }

    private void incerease() {
        if (array == null) {
            tempArray = new String[1];
            array = new String[0];
        } else {
            tempArray = new String[array.length + 1];
        }
    }

    @Override
    public void add(String string) {

        incerease();
        tempArray[array.length] = string;

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        array = tempArray;
    }

    @Override
    public void add(String string, int position) {
        incerease();
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (position == i) {
                tempArray[j] = string;
                ++j;
            }
            tempArray[j] = array[i];
        }
        array = tempArray;
    }

    //+
    @Override
    public int size() {
        return array.length;
    }

    //+
    @Override
    public void remove(String string) {
        if (indexOf(string) != -1) {
            remove(indexOf(string));
        }
    }

    @Override
    public void remove(int position) {
        decrease();
        for (int i = 0; i < tempArray.length; i++) {
            if (i != position) {
                tempArray[i] = array[i];
            }
        }
        array = tempArray;
    }

    @Override
    public void clear() {
        tempArray = new String[0];
        array = tempArray;
    }

    @Override
    public void set(String string, int position) {
        array[position] = string;
    }

    @Override
    public int indexOf(String string) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(string)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int position) {
        return array[position];
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public MyList() {
    }
}
