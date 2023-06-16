package Day0616.multipleTypeParameters;

public class Container<T, D extends Number> {
    private T item1;

    public Container(T item1, double v) {
        this.item1 = item1;
    }

    public T getItem1() {
        return this.item1;
    }

    public D getItem2() {
        return null;
    }
}
