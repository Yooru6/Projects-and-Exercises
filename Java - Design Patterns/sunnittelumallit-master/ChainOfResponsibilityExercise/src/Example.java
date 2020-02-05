import java.io.BufferedReader;
import java.io.InputStreamReader;

import Employees.AskForRaise;
import Employees.ImmediateManager;
import Employees.Boss;
import Employees.BigBoss;

public class Example {


    public static void main(String[] args) {
        ImmediateManager immediateManager = new ImmediateManager();
        Boss boss = new Boss();
        BigBoss bigboss = new BigBoss();
        
        //Authority hierarchy
        immediateManager.setAuthorization(boss);
        boss.setAuthorization(bigboss);
  
        
        try{    
        		System.out.println("Your unhappy and want a raise. Your current salary is: 3000");
                System.out.println("Desired new salary:");
                System.out.println(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                immediateManager.acceptRaise(new AskForRaise(d));
        } catch(Exception e){
           e.printStackTrace();
        }
    }    
}