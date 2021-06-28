package classes;

public class Value<T> implements Expression {

    private T value;

    public Value(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public Value evaluate() {
        return this;
    }

    @Override
    public String toString() {
        return  ""+value;
    }
}
