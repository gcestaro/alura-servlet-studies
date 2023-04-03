package gerenciador.com.github.gcestaro.servlet;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
        HttpServletResponse response)
        throws IOException, ServletException {

        String uuid = request.getParameter("uuid");
        System.out.println(uuid);

        BancoDeDados banco = new BancoDeDados();
        Empresa empresa = banco.getEmpresa(UUID.fromString(uuid))
            .orElseThrow();

        System.out.println(empresa.getNome());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
        request.setAttribute("empresa", empresa);
        dispatcher.forward(request, response);
    }

}
