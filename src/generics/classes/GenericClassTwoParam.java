package generics.classes;

public class GenericClassTwoParam <S,U>{

    //2 tane field'i olan data tiplerini referans alsin

    private S field;
    private U type;

    public S getField() {
        return field;
    }

    public void setField(S field) {
        this.field = field;
    }

    public U getType() {
        return type;
    }

    public void setType(U type) {
        this.type = type;
    }
}
