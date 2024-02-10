package generics.interfaces;

public class GenericInterfaceImpl<T> implements GenericClass<T>{
    @Override
    public void value(T value) {
        System.out.println("Bu metodda istediğimiz data tipini parametre olarak alabiliriz:"+value);
    }

    @Override
    public T getValue() {
        return null;
    }
}
