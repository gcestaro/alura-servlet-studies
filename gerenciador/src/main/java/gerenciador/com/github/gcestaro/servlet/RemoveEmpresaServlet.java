package gerenciador.com.github.gcestaro.servlet;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
        
        String uuid = request.getParameter("uuid");
        System.out.println(uuid);
        
        BancoDeDados banco = new BancoDeDados();
        banco.removeEmpresa(UUID.fromString(uuid));
        
        response.sendRedirect("getEmpresas");
    }
}
