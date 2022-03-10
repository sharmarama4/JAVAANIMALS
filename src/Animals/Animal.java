package Animals;

public abstract class Animal {
    //public void move(){// Here  is niet goed
        //System.out.println("walks");
   // }
    public abstract void move();
    public abstract void makeNoise();
    public boolean isAlive(){
        return true;
    }
}
