package exercicio01;

public record Email(String mensagem) implements EnviaMensagem {

	@Override
	public String enviarMensagem() {
		return "Enviando mensagem pelo Email";
	}

}
