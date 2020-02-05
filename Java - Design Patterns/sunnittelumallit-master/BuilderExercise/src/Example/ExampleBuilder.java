package Example;

import Builders.BurgerBuilderIF;
import Builders.HesburgerBuilder;
import Builders.McDonaldsBuilder;

public class ExampleBuilder {

    public static void main(String[] arg)
    {

        BurgerBuilderIF heseBuilder = new HesburgerBuilder();
        BurgerBuilderIF mcDonaldBuilder = new McDonaldsBuilder();

        System.out.println("Hese Burger:");
        heseBuilder.addBread();
        heseBuilder.addCheese();
        heseBuilder.addLettuce();
        heseBuilder.addSauce();
        heseBuilder.addSteak();

        System.out.println(heseBuilder.getBurger());

        System.out.println("\n\nMcDonalds Burger:");
        mcDonaldBuilder.addSteak();
        mcDonaldBuilder.addSauce();
        mcDonaldBuilder.addLettuce();
        mcDonaldBuilder.addCheese();
        mcDonaldBuilder.addBread();

        System.out.println(mcDonaldBuilder.getBurger());




    }
}
