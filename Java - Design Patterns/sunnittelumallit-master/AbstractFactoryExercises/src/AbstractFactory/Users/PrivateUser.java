package AbstractFactory.Users;
import java.util.ArrayList;
import java.util.List;

import AbstractFactory.Clothing.Clothing;

public class PrivateUser extends User{
    private String username;
    private ArrayList<Clothing> clothes;


    public PrivateUser(String username) {
        this.username = username;
        this.clothes = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return username;
    }


    @Override
    public ArrayList<Clothing> getClothes() {
        return clothes;

    }
    @Override
    public void dressUp(Clothing clothing) {
        this.clothes.add(clothing);
        System.out.print(username+" puts on "+clothing.getClothingBrand()+" "+clothing.getClothingType()+"\n" );

    }

    @Override
    public void setClothes(ArrayList<Clothing> vaatteet) {
        this.clothes= (ArrayList<Clothing>) vaatteet;

    }
    
    @Override
    public void undress() {
    	clothes.clear();
    	System.out.println(username+" takes off all his/her clothes and is now naked...\n");
    }

}
