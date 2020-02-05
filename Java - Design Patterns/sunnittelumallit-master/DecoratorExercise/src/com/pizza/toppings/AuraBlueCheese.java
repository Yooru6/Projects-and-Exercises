package com.pizza.toppings;

import com.pizza.decorator.Pizza;
import com.pizza.decorator.PizzaDecorator;

public class AuraBlueCheese extends PizzaDecorator {
	String name = "Aura Blue Cheese";
	double price=1.5;

	public AuraBlueCheese(Pizza topping) {
		super(topping);
	}
	
	
    @Override
    public double getPrice() {
        return super.getPrice()+price;
    }
	
	@Override
	public String decorate() {
		return super.decorate()+", "+name;		
	}

}
