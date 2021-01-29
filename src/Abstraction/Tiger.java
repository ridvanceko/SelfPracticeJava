package Abstraction;

public class Tiger extends LandAnimal {

    public LandAnimal(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    void eat(){
        System.out.println("Land animal is eating");
    }
    void drink(){
        System.out.println("Land animal is drinking");
    }
    void resting(){
        System.out.println("Land animal is resting");
    }
    void hunting(){
        System.out.println("Land animal is hunting");
    }

    void run(){
        System.out.println(name+" is running");
    }

    void walking(){
        System.out.println(name+" is walking");
    }

}
