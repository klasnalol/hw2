public class Math {
    public int a,b;
    public static int sum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    public Math(int a,int b){
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args){
        Math odin = new Math(2, 3);
    }
}
