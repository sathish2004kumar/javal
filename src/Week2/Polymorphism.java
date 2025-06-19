package Week2;
class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class lion extends Animals {
    @Override
    void sound() {
        System.out.println("lion roar");
    }
}

class Cat extends Animals {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animals a1 = new lion();  
        Animals a2 = new Cat();

        a1.sound(); 
        a2.sound(); 
    }
}
