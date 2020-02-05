package com.pizza.toppings;

import com.pizza.decorator.Pizza;
import com.pizza.decorator.PizzaDecorator;

public class Banana extends PizzaDecorator {
	String name = "Banana";
	double price=1.5;

	public Banana(Pizza topping) {
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
