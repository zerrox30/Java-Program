class AnotherClass {
    String name;

    void greet(String name)
    {
        this.name = name;
        System.out.println("Hello Dear " + name + ", do have a good time");
    }
}

    class Main{

    public static void main(String[] args) {
        System.out.println("In main");
        AnotherClass nn = new AnotherClass();
        nn.greet("Deep Jaiswal");
    }
}