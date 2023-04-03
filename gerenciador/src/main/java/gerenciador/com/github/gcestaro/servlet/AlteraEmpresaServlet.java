package gerenciador.com.github.gcestaro.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
        HttpServletResponse response)
        throws IOException, ServletException {

        var uuid = request.getParameter("uuid");
        var nome = request.getParameter("lblNomeEmpresa");
        var aberturaEmpresa = request.getParameter("dtAberturaEmpresa");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
            .withLocale(Locale.getDefault());

        LocalDate dataAberturaEmpresa = LocalDate.parse(aberturaEmpresa,
            formatter);

        var bd = new BancoDeDados();

        bd.getEmpresa(UUID.fromString(uuid))
            .map(empresa -> {
                empresa.setDataAbertura(dataAberturaEmpresa);
                empresa.setNome(nome);
                return empresa;
            });

        response.sendRedirect("getEmpresas");
    }

}
