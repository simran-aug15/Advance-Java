class Boxx<T,L>
{
    T value;
    L number;
    void set(T value,L number)
    {
        this.value =value;
        this.number=number;
    }
    T get()
    {
        return value;

    }
    L getNumber()
    {
        return number;
    }
}
class Doublegeneric {
    public static void main (String[]args)
    {
        Boxx<Integer,Character>b1=new Boxx<>();
        b1.set(10,'A');
        System.out.println(b1.get());
        System.out.println(b1.getNumber());
    }
}