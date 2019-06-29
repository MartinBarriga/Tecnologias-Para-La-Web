
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
            String cantidadEms = request.getParameter("cantidadEms");
            int cantidadEmsInt = Integer.parseInt(cantidadEms);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadEms",cantidadEms);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get' />");
            for(int i = 0; i < cantidadEmsInt; i++)
            {
                out.println("Introduce el texto " + i + ": <input type = 'text' name = 'texto" + i + "' /> <br/> <br/>");
                
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
           
            out.println("</body>");
            out.println("</html>");
    }
}