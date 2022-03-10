package Animals;

public class Fish extends Animal {
    public void swim(){
        System.out.println("This fish swims");
    }

    @Override
    public void move() {
        System.out.println("Swims");
    }

    @Override
    public void makeNoise() {
        System.out.println("hehehee");
    }
}
