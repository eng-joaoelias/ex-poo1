/*
 *2- Crie 3 objetos da classe Animal criada anteriormente e 
defina os valores para todos os atributos da classe. 
*/

package lista3.test;

import lista3.classes.Animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		
		a1.setNome("Cachorro");
		a1.setRaca("Labrador");
		a1.setPeso(3.45);
		a1.setIdade(8);
		a1.setAltura(1.0);
		
		a2.setNome("Gato");
		a2.setRaca("Persa");
		a2.setPeso(3.5);
		a2.setIdade(6);
		a2.setAltura(0.25);

		a3.setNome("Cavalo");
		a3.setRaca("Árabe");
		a3.setPeso(400.0);
		a3.setIdade(10);
		a3.setAltura(1.6);
	}

}
