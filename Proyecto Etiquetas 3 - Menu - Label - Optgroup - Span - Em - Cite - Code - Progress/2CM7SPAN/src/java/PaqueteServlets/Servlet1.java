
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
            String cantidadSpans = request.getParameter("cantidadSpans");
            int cantidadSpansInt = Integer.parseInt(cantidadSpans);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadSpans",cantidadSpans);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get' />");
            for(int i = 0; i < cantidadSpansInt; i++)
            {
                out.println("Span " + i + "<br/> <br/> <br/>");
                out.println("Introduce el texto: <input type = 'text' name = 'texto" + i + "' /> <br/> <br/>");
                out.println("Introduce el color: <input type = 'text' name = 'color" + i + "' /> <br/> <br/> <br/>");
                
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
           
            out.println("</body>");
            out.println("</html>");
    }
}