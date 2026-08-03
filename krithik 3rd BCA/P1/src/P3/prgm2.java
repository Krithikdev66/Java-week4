package P3;
abstract class Animal{
    abstract void eat();
    abstract void run();
}
class cat extends Animal {
    @Override
    void eat() {
        System.out.println("cat class--eat()");
    }

    @Override
    void run() {
        System.out.println("cat class--run()");
    }
}
public class prgm2 {
    public static void main(String[] args) {
        cat c=new cat();
        c.eat();
        c.run();
    }
}
