package exercicio01;

public record SMS(String mensagem) implements EnviaMensagem {

	@Override
	public String enviarMensagem() {
		return "Enviando Mensagem pelo SMS";
	}

}
