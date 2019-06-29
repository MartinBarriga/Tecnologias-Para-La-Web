
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
            String cantidadCites = request.getParameter("cantidadCites");
            int cantidadCitesInt = Integer.parseInt(cantidadCites);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadCites",cantidadCites);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get' />");
            for(int i = 0; i < cantidadCitesInt; i++)
            {
                out.println("cite " + i + "<br/> <br/> <br/>");
                out.println("Introduce el titulo: <input type = 'text' name = 'titulo" + i + "' /> <br/> <br/>");
                out.println("Introduce el texto: <input type = 'text' name = 'texto" + i + "' /> <br/> <br/> <br/>");
                
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
           
            out.println("</body>");
            out.println("</html>");
    }
}