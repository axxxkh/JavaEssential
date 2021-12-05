package AdditionalTask;

public class MyClass<T> {

    // чесно кажучи навіть не знаю чи це правильно. щось не так просто тут розібратись
    public static <T> T factoryMethod() {
        return (T) new MyClass<T>();
    }

    public static void main(String[] args) {
        MyClass<String> clas = new MyClass<>();
        System.out.println(factoryMethod().toString());
    }
}
