package app.i;
//abstract class 2
//override

abstract class Animal{
    String kind;
    void test(){
        System.out.println("work out");
    }
    abstract void cry();
}

class Cat extends Animal{

    @Override
    void cry() {
        System.out.println("meow");
    }

    @Override
    void test(){
        System.out.println("no work out");
    }
}

class Dog extends Animal{

    @Override
    void cry() {
        System.out.println("bowwow");
    }
}
public class i{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.test();
        a.cry();
        a = new Cat();
        a.test();
        a.cry();

        animalSound(new Dog());
        animalSound(new Cat());
        
    }

    static void animalSound(Animal a){
        a.cry();
    }
} 