package Animals;

public class Cat extends Animal {
    @Override
    public void move(){
        System.out.println("walks");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meumew");
    }
}
