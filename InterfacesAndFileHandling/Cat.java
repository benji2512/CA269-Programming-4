// Remove 'implements Polite' to generate an 'Incompatible types' error
public class Cat implements Order
{
    private String name;

    public Cat(String n)
    {
        name = n;
    }

    public String toString()
    {
        return "cat: " + name;
    }

    public void hello() {
        System.out.println("Hello!");
    }

    public String getName(){
        return name;
    }

    public boolean lessThan(Order order){
        Cat c = (Cat) other;

    }
}
