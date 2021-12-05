package TaskThree;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey, TValue> {
    // тут довелось піддивитись відповіді, шоб зрозуміти задачу
    // досить цікавоБ map інтерфейс, а HashMap виходить клас, який його імплементує
    // в принципі як розумію можна створити типу екземпляр і самого map, але доведеться
    // в ручну оверрайдити всі його методи. це в принципі тоді все одно буде по суті клас правда анонімний
    // якщо не помиляюсь
    Map<TKey, TValue> dictionary = new HashMap<>();

    public void add(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    public TValue get(TKey key) {
        return dictionary.get(key);
    }

    public int getSize() {
        return dictionary.size();
    }

    public static void main(String[] args) {
        MyDictionary<Integer, String> dictionary = new MyDictionary<>();
        dictionary.add(8, "asd");
        dictionary.add(0, "dsa");
        System.out.println(dictionary.getSize());
        System.out.println(dictionary.get(8));
    }
}
