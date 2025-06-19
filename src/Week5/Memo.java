package Week5;
class Persons {
    String name;

    Persons(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Name: " + name);
    }
}

public class Memo{
    public static void main(String[] args) {
        int age = 25;                      // Stored in Stack
        Persons  p = new Persons("Ravi");     // Reference 'p' is in Stack, object is in Heap

        p.showName();                      // Method call goes to Stack temporarily
    }
}
