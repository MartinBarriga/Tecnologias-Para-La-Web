
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
            String cantidadAsides = request.getParameter("cantidadAsides");
            int cantidadAsidesInt = Integer.parseInt(cantidadAsides);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadAsides", cantidadAsides);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get' >");
            for(int i = 0; i < cantidadAsidesInt; i++)
            {
                out.println("Articulo " + i);
                out.println("<br/>");
                out.println("<br/>");
                
                out.println("Introduce la cantidad de headings: <input type = 'text' name = 'cantidadH" + i+ "' />");
                out.println("<br/> <br/>");
                out.println("Introduce la cantidad de parrafos: <input type = 'text' name = 'cantidadP" + i+ "' />");
                out.println("<br/> <br/> <br/>");
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}