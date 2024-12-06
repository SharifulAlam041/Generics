package org.example;

public class MultiBound<T extends ParentMultiBound & Interface1 & Interface2> {
    T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value=value;
    }
}
