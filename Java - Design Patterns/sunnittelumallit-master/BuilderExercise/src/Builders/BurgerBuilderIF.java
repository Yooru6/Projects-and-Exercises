package Builders;

import java.util.Optional;

public interface BurgerBuilderIF <T>{
    public void addLettuce();
    public void addCheese();
    public void addSteak();
    public void addBread();
    public void addSauce();

    public T getBurger();

}
