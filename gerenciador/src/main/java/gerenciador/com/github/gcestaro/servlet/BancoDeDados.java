package gerenciador.com.github.gcestaro.servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class BancoDeDados {

	private static List<Empresa> empresas = new ArrayList<>();

	static {
		empresas.add(new Empresa("Google"));
		empresas.add(new Empresa("Alura"));
		empresas.add(new Empresa("Caelum"));
		empresas.add(new Empresa("Oracle"));
	}
	
	public void adiciona(Empresa empresa) {
		empresas.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}
	
	public Optional<Empresa> getEmpresa(UUID id) {
	    return empresas.stream()
	        .filter(empresa -> empresa.getUuid().equals(id))
	        .findFirst();
	}

    public void removeEmpresa(UUID uuid) {
        empresas.stream()
            .filter(empresa -> empresa.getUuid().equals(uuid))
            .findFirst()
            .ifPresent(empresas::remove);
        
    }
}
