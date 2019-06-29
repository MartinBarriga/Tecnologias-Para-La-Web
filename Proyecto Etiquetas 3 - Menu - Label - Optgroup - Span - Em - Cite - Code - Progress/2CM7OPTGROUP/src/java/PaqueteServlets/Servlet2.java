
package PaqueteServlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet2 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession();
            String cantidadClasificaciones = (String) session.getAttribute("cantidadClasificaciones");
            int cantidadClasificacionesInt = Integer.parseInt(cantidadClasificaciones);
           
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet4' method = 'get'>");
            for(int i = 0; i < cantidadClasificacionesInt; i++)
            {
                String clasificacion = request.getParameter("clasificacion" +i);
                session.setAttribute("clasificacion" + i, clasificacion);
                out.println("Clasificacion " + clasificacion + "<br/> <br/>");
                String cantidadOpciones = request.getParameter("cantidadOpciones" + i);
                int cantidadOpcionesInt = Integer.parseInt(cantidadOpciones);
                session.setAttribute("cantidadOpciones" + i, cantidadOpciones);
                for(int j = 0; j < cantidadOpcionesInt; j++)
                {
                out.println("Opcion "+j+": <input type = 'text' name= 'opcion" +i+j +"' /> <br/> <br/>");
            
                }
            }
            out.println("<input type = 'submit'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}
