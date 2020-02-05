package Employees;

import CheckAuthority.Authorization;

public class Boss extends Authorization {
    
    private final double limitForRaise=BaseSalary*1.05 ;
    
    @Override
    public void acceptRaise(AskForRaise request) {
        if(request.getAmount() < limitForRaise) {
            System.out.println("Boss handles your raise");
        } else if(authorization != null) {
            authorization.acceptRaise(request);
        }
    }
}