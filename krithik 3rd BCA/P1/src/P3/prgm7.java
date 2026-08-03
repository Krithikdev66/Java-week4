package P3;
class animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class Dog extends animal1{
    void eat(){
        System.out.println("dog is eating");
    }
}
public class prgm7 {
    public static void main(String[] args) {
        Animal2 a=new Dog1();
        a.eat();
    }
}
