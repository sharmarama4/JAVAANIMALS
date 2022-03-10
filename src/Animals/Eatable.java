package Animals;

public interface Eatable {
    void eats();
    default boolean stillEats(){
        return true;
    }
}
