
package PaqueteServlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            String cantidadButtons = request.getParameter("cantidadButtons");
            int cantidadButtonsInt = Integer.parseInt(cantidadButtons);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadButtons", cantidadButtons);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get'>");
            for(int i = 0; i < cantidadButtonsInt; i++)
            {
                out.println("Button " + i);
                out.println("<br/> <br/> <br/>");
                out.println("Introduce el mensaje emergente: <input type = 'text' name = 'mensajeEmergente"+ i +"' />");
                out.println("<br/><br/>");
                out.println("Introduce el mensaje contenido en el boton: <input type = 'text' name = 'mensajeContenido" + i +"' />");
                out.println("<br/> <br/> <br/> <br/>");
            }  
            out.println("<input type = 'submit' />");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
    }
}
