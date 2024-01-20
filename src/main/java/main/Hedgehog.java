package main;
public class Hedgehog {
    private String name;
    private int age;
    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }
    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void talk() {
        System.out.println("I am " + name + " and my age is " + age + ", but could you still give me input values?");
    }
    public void run(int laps) {
        for (int i = 0; i < laps; i++) {
            System.out.println(name + " runs really fast!");
        }
    }
    public void speak(String message) {
        System.out.println(name + ": " + message);
    }
    public String getName() {
        return name;
    }
}
