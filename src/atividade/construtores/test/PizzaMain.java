package atividade.construtores.test;

import atividade.construtores.classes.Pizza;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza1 = new Pizza("Pizza de Calabresa", 30.0, 5);
        Pizza pizza2 = new Pizza("Pizza de Frango com Catupiry", 35.0, 4);
        Pizza pizza3 = new Pizza("Pizza Vegetariana", 28.0, 7);
        
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        
	}

}
