public class Cat1 implements Order
{
    private String name;

    public Cat1(String n)
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
        Cat1 c = (Cat1) order;
        return name.length() < c.getName().length();
    }
}
