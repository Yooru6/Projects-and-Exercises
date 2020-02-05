package Builders;

import Parts.*;

import java.util.Optional;

public class HesburgerBuilder implements BurgerBuilderIF<StringBuilder> {
    StringBuilder sBuilder;

    public HesburgerBuilder() {
        this.sBuilder = new StringBuilder();
    }

    @Override
    public void addLettuce() {
        PartsIF lettuce=new Lettuce("Iceberg\n");
        sBuilder.append(lettuce.toString());


    }

    @Override
    public void addCheese() {
        Cheese cheese=new Cheese("Cheddar\n");
        sBuilder.append(cheese.toString());
    }

    @Override
    public void addSteak() {
        Steak Steak=new Steak("Cheddar\n");
        sBuilder.append(Steak.toString());
    }

    @Override
    public void addBread() {
        Bread Bread=new Bread("Oat\n");
        sBuilder.append(Bread.toString());

    }

    @Override
    public void addSauce() {
        PartsIF Sauce=new Sauce("Mayo & Ketchup\n");
        sBuilder.append(Sauce.toString());
    }

    @Override
    public StringBuilder getBurger() {
        return sBuilder;
    }


}
