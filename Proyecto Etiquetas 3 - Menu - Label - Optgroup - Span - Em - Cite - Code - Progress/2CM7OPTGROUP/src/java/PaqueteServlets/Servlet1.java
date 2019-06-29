
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
            String cantidadClasificaciones = request.getParameter("cantidadClasificaciones");
            int cantidadClasificacionesInt = Integer.parseInt(cantidadClasificaciones);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadClasificaciones", cantidadClasificaciones);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get'>");
            for(int i = 0; i < cantidadClasificacionesInt; i++)
            {
                out.println("Clasificacion " + i + "<br/> <br/>");
                out.println("Introduce el nombre de la clasificacion: <input type = 'text' name = 'clasificacion"+ i +"' />");
                out.println("<br/> <br/>");
                out.println("Introduce el numero de opciones: <input type = 'text' name = 'cantidadOpciones" + i + "' />");
                out.println("<br/> <br/> <br/>");
            }  
            out.println("<input type = 'submit' />");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
    }
}
