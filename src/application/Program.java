package application;

import java.util.Scanner;

import entities.ValidaCpfCnpj;

public class Program {
	
	public static void main(String[] args) {
		
		ValidaCpfCnpj validaCPF = new ValidaCpfCnpj();
		
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o seu CPF: ");
        String cpf = ler.nextLine();
        
        if (validaCPF.isCPF(cpf)) {
        	System.out.println();
        	System.out.println("CPF Válido: ");
        	System.out.println(validaCPF.imprimeCPF(cpf));
        }else {
        	System.out.println("CPF inválido!!!");
        }
        
        System.out.println(" ---------------------------------- ");
        
        System.out.print("Digite o seu CNPJ: ");
        String cnpj = ler.nextLine();
        
        if (validaCPF.isCNPJ(cnpj)) {
        	System.out.println();
        	System.out.println("CNPJ Válido: ");
        	System.out.println(validaCPF.imprimeCNPJ(cnpj));
        }else {
        	System.out.println("CNPJ inválido!!!");
        }
        
        ler.close();
        
	}
}