package gerenciador.com.github.gcestaro.servlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OlaMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// response.getOutputStream(); // used when returning binary data (e.g. files)
		var writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Ola mundo! Isso é um servlet");
		writer.println("</body>");
		writer.println("</html>");
	}
}
