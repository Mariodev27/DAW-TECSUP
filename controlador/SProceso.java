package controlador;
import modelo.Cliente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.catalina.connector.Request;

public class SProceso extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public SProceso() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Codigo
		String Codigo = request.getParameter("txtCodigo");
		Cliente cli=Cliente.busqueda(Codigo);
		String vista;
		if(cli==null) {
			vista="error.jsp";
		} else {
			vista ="resultado.jsp";
			request.setAttribute("info", cli);
		}
		RequestDispatcher rd=request.getRequestDispatcher(vista);
		rd.forward(request, response);
	}

}
