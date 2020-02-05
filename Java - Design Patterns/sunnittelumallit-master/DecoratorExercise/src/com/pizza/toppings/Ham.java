package com.pizza.toppings;

import com.pizza.decorator.Pizza;
import com.pizza.decorator.PizzaDecorator;

public class Ham extends PizzaDecorator {
	String name = "Ham";
	double price=1.5;

	public Ham(Pizza topping) {
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
