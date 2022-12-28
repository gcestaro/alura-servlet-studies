package gerenciador.com.github.gcestaro.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/getEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		var bd = new BancoDeDados();
		var empresas = bd.getEmpresas();

		var dispatcher = request.getRequestDispatcher("/listaEmpresas.jsp");
		request.setAttribute("empresas", empresas);
		dispatcher.forward(request, response);

	}
}
