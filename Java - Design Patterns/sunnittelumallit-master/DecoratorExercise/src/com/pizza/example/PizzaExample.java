package com.pizza.example;

import com.pizza.decorator.Pizza;
import com.pizza.toppings.*;
import com.pizza.toppings.Kebab;

import java.util.ArrayList;

import com.pizza.crusts.Crust;

public class PizzaExample {
	
	public static void main(String[] args) {
		
		ArrayList<Pizza> pizzat = new ArrayList();
		
		Pizza hamKebab = new Ham(new Kebab(new Crust("Ham & Kebab")));
		Pizza banaAuraLiver = new Banana(new Liver(new AuraBlueCheese(new Crust("Pekka Special"))));
		Pizza pineOniKebabHamLiverAura = new Onion(new Ham(new Kebab(new Banana(new Liver(new AuraBlueCheese(new Crust("Rex Favorite")))))));
		
		pizzat.add(hamKebab);
		pizzat.add(banaAuraLiver);
		pizzat.add(pineOniKebabHamLiverAura);
		
		for(Pizza p:pizzat) {
			System.out.println("********************");
			System.out.println(p.decorate());
			System.out.print("Price: "+p.getPrice()+"\n");
			System.out.println("********************");
		}
		

	}

}
