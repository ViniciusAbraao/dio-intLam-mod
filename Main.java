package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Você deseja enviar a mensagem por qual canal?");
		System.out.println("1 - SMS");
		System.out.println("2 - Email");
		System.out.println("3 - Redes Sociais");
		System.out.println("4 - WhatsApp");
		int opcao = s.nextInt();

		switch (opcao) {
			case 1 -> {
				System.out.println("Digite a mensagem: ");
				String msg = s.next();
				var inst = new SMS(msg);
				System.out.println(inst.enviarMensagem());
				break;
			}
			case 2 -> {
				System.out.println("Digite a mensagem: ");
				String msg = s.next();
				var inst = new Email(msg);
				System.out.println(inst.enviarMensagem());
				break;
			}
			case 3 -> {
				System.out.println("Digite a mensagem: ");
				String msg = s.next();
				var inst = new RedesSociais(msg);
				System.out.println(inst.enviarMensagem());
				break;
			}
			case 4 -> {
				System.out.println("Digite a mensagem: ");
				String msg = s.next();
				var inst = new WhatsApp(msg);
				System.out.println(inst.enviarMensagem());
				break;
			}
			default -> {
				System.out.println("Opção Invalida");
				break;
			}

		}
	}

}
