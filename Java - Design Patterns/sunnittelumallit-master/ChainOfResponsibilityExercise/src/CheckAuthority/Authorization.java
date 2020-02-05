package CheckAuthority;

import Employees.AskForRaise;

public abstract class Authorization {
	 protected static final double BaseSalary = 3000;
	 protected Authorization authorization;
	    
	    
	 public void setAuthorization(Authorization authorization){
	      this.authorization = authorization;
	 }
	    
	 abstract public void acceptRaise(AskForRaise request);
}