package Builders;

import Parts.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class McDonaldsBuilder implements BurgerBuilderIF<List> {

    private List<PartsIF> parts;

    public McDonaldsBuilder() {
        this.parts=new ArrayList<>();
    }

    @Override
    public void addLettuce() {
        PartsIF lettuce=new Lettuce("Iceberg");
        parts.add(lettuce);

    }

    @Override
    public void addCheese() {
        PartsIF cheese=new Cheese("Cheddar");
        parts.add(cheese);
    }

    @Override
    public void addSteak() {
        PartsIF Steak=new Steak("Cheddar");
        parts.add(Steak);
    }

    @Override
    public void addBread() {
        PartsIF Bread=new Bread("Oat");
        parts.add(Bread);

    }

    @Override
    public void addSauce() {
        PartsIF Sauce=new Sauce("Mayo & Ketchup");
        parts.add(Sauce);
    }

    @Override
    public List getBurger() {
        return parts;
    }


}
