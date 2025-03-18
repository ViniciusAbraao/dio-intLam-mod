package exercicio01;

public record WhatsApp(String mensagem) implements EnviaMensagem {

	@Override
	public String enviarMensagem() {
		return "Enviando mensagem pelo WhatsApp";
	}

}
