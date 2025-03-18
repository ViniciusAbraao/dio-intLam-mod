package exercicio01;

public record RedesSociais(String mensagem) implements EnviaMensagem{

	@Override
	public String enviarMensagem() {
		return "Enviando mensagem pela Rede Social";
	}

}
