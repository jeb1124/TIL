package pizza.service.impl;

import pizza.parent.Pizza;
import pizza.service.PizzaService;

public class PizzaServiceImpl implements PizzaService {

	static final public PizzaServiceImpl service = new PizzaServiceImpl();//
	private PizzaServiceImpl() {}//2.
	public static PizzaServiceImpl getInstance() {//3.
		return service;	
	}
	
	@Override
	public void allMakePizza(Pizza[] pizzas) {
		for(Pizza p : pizzas) {
			System.out.println(p);
			p.makePizza();
			System.out.println("======================");
		}
		
	}

}
