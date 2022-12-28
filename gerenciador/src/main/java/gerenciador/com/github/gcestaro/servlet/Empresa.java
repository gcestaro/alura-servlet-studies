package gerenciador.com.github.gcestaro.servlet;

import java.util.UUID;

public class Empresa {

	private UUID uuid;

	private String nome;

	public Empresa(String nome) {
		uuid = UUID.randomUUID();
		this.nome = nome;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
