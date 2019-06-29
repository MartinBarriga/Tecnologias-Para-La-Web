
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
            int cantidadCitesInt = Integer.parseInt((String)session.getAttribute("cantidadCites"));
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < cantidadCitesInt; i++)
            {
                out.println("<cite> " + request.getParameter("titulo" + i) + "</cite> " + request.getParameter("texto" + i));
                out.println("<br/> <br/>");
            }
            out.println("</body>");
            out.println("</html>");
    }
}