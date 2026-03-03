interface B{
    int cube(int x);
}
public class para{
    public static void main(String[]args)
    {
        B obj =(int x)->x*x*x;
        System.out.println(obj.cube(5));
    }
}
