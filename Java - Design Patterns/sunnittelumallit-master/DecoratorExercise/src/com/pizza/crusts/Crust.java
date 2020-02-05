package com.pizza.crusts;

import com.pizza.decorator.Pizza;

public class Crust implements Pizza {
	
	private String pizzaType;
	private double price=7.5;
	private String name="Basic crust";
	
	public Crust(String pizzaType) {
		this.pizzaType=pizzaType;
	}

	@Override
	public double getPrice() {
		return price;
	}


	@Override
	public String decorate() {
		return pizzaType+":\n"+name;	
	}

}
