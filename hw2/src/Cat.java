public class Cat {
    private String name;
    private Integer weight;
    private String color;
    public static String meow(String n)
    {
        System.out.println(n + " says meow");
        return n;
    }

    public Cat(String catname,Integer catweight,String catcolor)
    {
        this.name = catname;
        this.weight = catweight;
        this.color = catcolor;
    }
    public  static void main(String[] args) {
        Cat barsik = new Cat("barsik", 69, "blue");
        Cat nebarsik = new Cat("nebarsik", 69, "pink");
        String da = meow(String.valueOf(barsik.name));
    }
}
