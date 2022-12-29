package gerenciador.com.github.gcestaro.servlet;

import java.time.LocalDate;
import java.util.UUID;

public class Empresa {

    private UUID uuid;

    private String nome;

    private LocalDate dataAbertura;

    private Empresa() {
        uuid = UUID.randomUUID();
    }

    public Empresa(String nome) {
        this(nome, LocalDate.now());
    }

    public Empresa(String nome, LocalDate dataAbertura) {
        this();
        this.nome = nome;
        this.dataAbertura = dataAbertura;
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

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
