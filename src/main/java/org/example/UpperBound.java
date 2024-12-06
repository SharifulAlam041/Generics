package org.example;

public class UpperBound<T extends Number> {
    T value;
    public T printValue() {
        return value;
    }
    public void setValue(T value) {
        this.value=value;
    }
}
