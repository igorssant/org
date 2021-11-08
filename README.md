Implementa o package escolhido (HTTP, COAP, MQTT)
	Dentro desse pacote implementar a classe concreta Remetente,Pacote e GUIAbstractFactory

	implementar Remetente com os métodos:
		connect(String enderecoDeDestino)
		autenticar()
		send(Pacote dados)
		close()

	implementar Pacote com os métodos:
 
	prepararDados(String dados)
	criptografar()

	Implementar GuiAbstractFactory que servira para criar o remetente e o pacote
