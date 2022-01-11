package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import objetos.Funcionarios;

public class exercicioOne {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.println("Entre com o numero de funcionários: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Funcionario #"+ (i + 1) +":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			System.out.println("");
			
			Funcionarios func = new Funcionarios(id, salario, nome);
			list.add(func);			
		}
		
		System.out.println("Entre com o ID do funcionario que irá receber aumento: ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if(pos == null){
			System.out.println("Esse ID não existe!");
		}else {
			System.out.println("Entre com a porcentagem de aumento: ");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentoSalario(porcentagem);
		}
		
		System.out.println("");
		System.out.println("Lista atualizada dos funcionários: ");
		for(Funcionarios fun : list) {
			System.out.println(fun);
		}
		
		sc.close();
	}
	public static Integer position (List<Funcionarios> list, int id) {
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
			else {
				return null;
			}
		}
		return id;
	}

}
