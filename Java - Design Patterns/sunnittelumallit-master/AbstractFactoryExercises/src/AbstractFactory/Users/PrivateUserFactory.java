package AbstractFactory.Users;

import java.util.ArrayList;
import java.util.Objects;

import AbstractFactory.Clothing.Clothing;

public class PrivateUserFactory implements UserAbstractFactory {
    private String username;
    private ArrayList<Clothing> clothes;

    public PrivateUserFactory(String username) {
        this.username = username;
        this.clothes = new ArrayList<>();
    }


    @Override
    public User createUser() {
        return new PrivateUser(username);
    }
}
