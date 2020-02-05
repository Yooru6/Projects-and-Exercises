


import AbstractFactory.Clothing.AdidasFactory;
import AbstractFactory.Clothing.BossFactory;
import AbstractFactory.Clothing.Clothing;
import AbstractFactory.Clothing.ClothingFactory;
import AbstractFactory.Users.PrivateUserFactory;
import AbstractFactory.Users.User;
import AbstractFactory.Users.UserFactory;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        testAbstractFactory("adidas","boss");
    }
    


    private static void testAbstractFactory(String tehdas1, String tehdas2) {
  
        Clothing lippis = ClothingFactory.makeClothing(tehdas1, "Lippalakki", "Pinkki", "Regular", 100);
        Clothing tPaita = ClothingFactory.makeClothing( tehdas1,"T-Shirt","Blue","L",32.50);
        Clothing farkut =ClothingFactory.makeClothing(tehdas1,"Pants","Gray","L",55.99);
        Clothing kengat = ClothingFactory.makeClothing( tehdas1,"Shoes","Black","43",109.00);



        //ArrayList<Clothing> vaatteet = new ArrayList<Clothing>();

        UserFactory user = new UserFactory();
        User jasperi = user.getUser(new PrivateUserFactory("Jasperi"));

       
        jasperi.dressUp(lippis);
        jasperi.dressUp(tPaita);
        jasperi.dressUp(farkut);
        jasperi.dressUp(kengat);

        System.out.println(jasperi.toString());
        jasperi.undress();
        
        
        jasperi.dressUp(lippis = ClothingFactory.makeClothing(tehdas2, "Lippalakki", "Pinkki", "Regular", 1000));
        jasperi.dressUp(tPaita = ClothingFactory.makeClothing( tehdas2,"T-Shirt","Blue","XXL",320.50));
        jasperi.dressUp(farkut =ClothingFactory.makeClothing(tehdas2,"Pants","Gray","XXXL",550.99));
        jasperi.dressUp(kengat = ClothingFactory.makeClothing( tehdas2,"Shoes","Black","43",1090.00));
        
        System.out.println(jasperi.toString());


    }
}

