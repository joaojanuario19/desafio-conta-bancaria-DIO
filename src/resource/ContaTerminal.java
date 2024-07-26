package resource;

import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando o objeto scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		//entrada/processamento dos dados pelo usuário
		
		
		
		System.out.println("Digite o nome do cliente : ");
		String nome = scanner.next();
		
		System.out.println("Digite o sobrenome do cliente : ");
		String sobrenome = scanner.next();
		
		System.out.println("Digite o número da conta : ");
		int numero = scanner.nextInt();
		
		System.out.println("Digite o codigo da agência : ");
		String agencia = scanner.next();
		
		System.out.println("Digite o saldo da conta : ");
		double saldo = scanner.nextDouble();
		
		//saida dos dados
		
		System.out.println("Olá ".concat(nome) + " ".concat(sobrenome) + ", obrigado por criar uma conta em nosso banco," +
				"\n" +" sua agência é "
				.concat(agencia)+ ", conta "+ numero + " e seu saldo "
				+ saldo + " já está disponível para saque");
		

	}

}
