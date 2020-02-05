package AbstractFactory.Users;

public class UserFactory {
    public static User getUser(UserAbstractFactory factory){
        return factory.createUser();
    }
    
}
