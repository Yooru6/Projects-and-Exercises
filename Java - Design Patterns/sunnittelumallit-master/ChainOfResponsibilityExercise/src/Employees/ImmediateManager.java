package Employees;

import CheckAuthority.Authorization;

public class ImmediateManager extends Authorization{

    private final double limitForRaise=BaseSalary*1.02;
    
    @Override
    public void acceptRaise(AskForRaise request) {
        if(request.getAmount() < limitForRaise) {
            System.out.println("Immediate Manager handles your raise.");
        } else if(authorization != null) {
            authorization.acceptRaise(request);
        }
    }
    
}