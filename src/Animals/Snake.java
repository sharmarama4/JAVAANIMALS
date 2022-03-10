package Animals;

public class Snake extends Animal {
    @Override
    public void move() {
       System.out.println("Slithers");
    }

    @Override
    public void makeNoise() {
        System.out.println("chee");
    }
}
