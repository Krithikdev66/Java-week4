package P3;
class Animal1{
    String name;
    int age;
    void animal_Details(){
        System.out.println("Name:"+name);
        System.out.println("Age: "+age);
    }
}
class Dog extends Animal1{
   String breed;
   void dog_details(){
       System.out.println("Breed:"+breed);
   }
    }

class cat1 extends Animal1{
    String color;
    void cat_details(){
        System.out.println("cat color:"+color);
    }
}
class bird extends Animal1{
   int wingspan;
    void bird_details(){
        System.out.println("wingspan:"+wingspan);
    }
}

public class prgm6 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="tommy";
        d.age=4;
        d.breed="labrador";
        d.animal_Details();

        cat1 c=new cat1();

        bird b=new bird();

    }
}
