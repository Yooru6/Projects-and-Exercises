package Employees;

import CheckAuthority.Authorization;

public class BigBoss extends Authorization{
    
    @Override
    public void acceptRaise(AskForRaise pyynto) {       
            System.out.println("Big Boss handling your raise.");
    }
}