package generics.classes;

public class GenericClass<T> {
    //Primitive Data Type ile kullanilamaz

    private String name;

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
