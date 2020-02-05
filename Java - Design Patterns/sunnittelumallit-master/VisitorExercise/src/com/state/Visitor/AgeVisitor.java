package com.state.Visitor;

import com.state.human.Human;

public class AgeVisitor implements VisitorIF {
    Human human;

    private int aging_requirment = 360;
    private int become_adult=18;
    private int become_senior=60;
    private int end=100;


    public AgeVisitor(Human human){
        this.human=human;
    }



    @Override
    public void Visit(Human human) {

        if (human.getDays()>= aging_requirment){
                human.ageUp();


            if ((human.getAge() == become_adult)){
                human.stateUp();


            }else if ((human.getAge() == become_senior)){
                human.stateUp();


            }else if (this.human.getAge()== end){
                System.out.println("Game over");
                human.printSummary();
                System.exit(0);
            }

        }else{
            System.out.println((360-human.getDays())+" days until birthday...");
        }


    }
}
