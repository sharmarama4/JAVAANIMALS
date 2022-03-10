package Apps;

import Animals.*;

public class AnimalApp {
    public static void main(String[] args) {
        Shark shark= new Shark();
        Cat cat=new Cat();
        Snake snake=new Snake();
         Kangaroo kangaroo =new Kangaroo();
         Fish fish=new Fish();
        Animal[] animals={shark,cat,snake,kangaroo,fish};
        for(Animal animal:animals ){
            animal.move();
        }
    }
}
