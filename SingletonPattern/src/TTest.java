public class TTest{
    public static void main(String[] args) {
        B b = new B();
    }
}

class B {
    int a = 100;
    String b = "";
    public static final int c ;
    static{
        c = 100;
        System.out.println(c);
        System.out.println("静态代码块");
    }
    public B(){
        System.out.println("构造函数");
    }
}
