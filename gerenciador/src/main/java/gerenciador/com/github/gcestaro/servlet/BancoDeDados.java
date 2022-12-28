package gerenciador.com.github.gcestaro.servlet;

import java.util.ArrayList;
import java.util.List;

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
}
