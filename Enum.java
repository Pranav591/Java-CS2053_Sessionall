
enum Level {
    LOW, MEDIUM, HIGH;

    void display() {
        System.out.println("Level: " + this);
    }
}

public class Enum {
    public static void main(String[] args) {
        Level l = Level.HIGH;
        l.display();

        for (Level x : Level.values()) {
            System.out.println(x + " at index " + x.ordinal());
        }
    }
}
