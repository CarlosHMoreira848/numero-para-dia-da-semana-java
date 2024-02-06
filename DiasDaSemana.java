import java.util.Scanner;
public class DiasDaSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia;
		System.out.println("Bem vindo ao programa que converte números em dias da semana!\n Para começar digite um número: ");
		dia = input.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Esse dia é Domingo!");
			break;
		case 2: 
			System.out.println("Esse dia é Segunda-feira!");
			break;
		case 3:
			System.out.println("Esse dia é Terça-feira!");
			break;
		case 4: 	
			System.out.println("Esse dia é Quarta-feira!");
			break;
		case 5:	
			System.out.println("Esse dia é Quinta-feira!");
			break;
		case 6: 
			System.out.println("Esse dia é Sexta-feira!");
			break;
		case 7: 
			System.out.println("Esse dia é Sábado!");
			break;
		default:
			System.out.println("NÚMERO INVÁLIDO!... DIGITE UM NÚMERO DE 1 ATÉ 7!");
		}
	}
}
