/**
 * 
 */
package atividade.construtores.test;

import java.util.Calendar;

import atividade.construtores.classes.Funcionario;

/**
 * @author joao_elias
 *
 */
public class FuncionarioMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

		Funcionario func1 = new Funcionario("Renato Caleb dos Santos", 10991.19, "Médico", 'M', (year - 2000)); //Medico
		Funcionario func2 = new Funcionario("Heloise Luciana Sarah Pereira", 4750, "Enfermeiro", 'F', (year-1962)); //enfermeiro
		
		System.out.println(func1);
		System.out.println(func2);
		
	}

}
