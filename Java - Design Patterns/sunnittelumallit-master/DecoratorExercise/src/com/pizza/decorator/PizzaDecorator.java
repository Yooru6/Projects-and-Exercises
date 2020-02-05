package com.pizza.decorator;

public class PizzaDecorator implements Pizza {
	
	protected Pizza pizza;
	
	public PizzaDecorator(Pizza topping) {
		this.pizza=topping;
	}

	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

	@Override
	public String decorate() {
		return pizza.decorate();		
	}


}
