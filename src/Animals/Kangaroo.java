package Animals;

public class Kangaroo extends Animal{
    @Override
    public void move() {
        System.out.println("Hops");
    }

    @Override
    public void makeNoise() {
        System.out.println("kang");
    }
}
