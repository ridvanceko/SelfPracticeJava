package Abstraction;

public class FlyingAnimal extends Animal{

    String wingSpan;

    public FlyingAnimal(String name, String color, int age, int weight, String wingSpan) {
        super(name, color, age, weight);
        this.wingSpan = wingSpan;
    }

    void eat(){
        System.out.println("Flying animal is eating");
    }
    void drink(){
        System.out.println("Flying animal is drinking");
    }
    void resting(){
        System.out.println("Flying animal is resting");
    }
    void hunting(){
        System.out.println("Flying animal is hunting");
    }

    void fly(){
        System.out.println(name+" is flying");
    }

    static void chirp(){
        System.out.println(" is chirping");
    }
}
