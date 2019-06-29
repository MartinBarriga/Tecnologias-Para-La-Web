
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
            String cantidadTextos = request.getParameter("cantidadTextos");
            int cantidadTextosInt = Integer.parseInt(cantidadTextos);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadTextos",cantidadTextos);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");           
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get'>");
            for(int i = 0; i < cantidadTextosInt; i++ )
            {
                out.println("Introduce el texto " + i +": <input type = 'text' name = 'texto" + i +"' />");
                out.println("Introduce la direccion del texto " + i +": <input type = 'text' name = 'direccion" + i +"' />");
                out.println("<br/> <br/>");
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}

