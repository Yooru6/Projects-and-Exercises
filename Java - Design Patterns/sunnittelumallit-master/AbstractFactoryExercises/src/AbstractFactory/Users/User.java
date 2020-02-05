package AbstractFactory.Users;

import java.util.ArrayList;
import java.util.List;

import AbstractFactory.Clothing.Clothing;

public abstract class User {
    public abstract String getUsername();
    public abstract void setClothes(ArrayList<Clothing> vaatteet);
    public abstract ArrayList<Clothing> getClothes();
    public abstract void dressUp(Clothing clothing);
    public abstract void undress();

    @Override
    public String toString(){

        return "Jasperi's wearing:\n\n"+ this.getClothes()+"\n";
    }


    
}
