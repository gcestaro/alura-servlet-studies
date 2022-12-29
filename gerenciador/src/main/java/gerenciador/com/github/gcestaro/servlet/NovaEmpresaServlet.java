package gerenciador.com.github.gcestaro.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
        HttpServletResponse response)
        throws IOException, ServletException {

        var nome = request.getParameter("lblNomeEmpresa");
        var aberturaEmpresa = request.getParameter("dtAberturaEmpresa");

        var empresa = new Empresa(nome);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
            .withLocale(Locale.getDefault());

        LocalDate dataAberturaEmpresa = LocalDate.parse(aberturaEmpresa,
            formatter);

        empresa.setDataAbertura(dataAberturaEmpresa);

        var bd = new BancoDeDados();
        bd.adiciona(empresa);

        response.sendRedirect("getEmpresas");
    }

}
