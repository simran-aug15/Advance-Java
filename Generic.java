class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class Generic {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(10);
        System.out.println(b1.get());
        Box<String> b2 = new Box<>();
        b2.set("Java");
        System.out.println(b2.get());
    }
}