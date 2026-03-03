class Plot<T> {
    T name;

    void set(T name) {
        this.name = name;
    }

    T get() {
        return name;
    }
}

class string extends Plot<String> {
}

class chart extends Plot<Character> {
}

public class Characterextend {
    public static void main(String[] args) {
        Plot<String> b1 = new Plot<>();
        b1.set("Simran");
        System.out.println(b1.get());
    }
}