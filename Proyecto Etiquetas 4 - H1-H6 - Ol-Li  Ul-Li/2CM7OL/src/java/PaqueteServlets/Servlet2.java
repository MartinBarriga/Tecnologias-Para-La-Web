
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
            int cantidadOlInt = Integer.parseInt((String)session.getAttribute("cantidadOl"));
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<ol>");
            for(int i = 0; i < cantidadOlInt; i++)
            {
                out.println("<li>" + request.getParameter("texto" + i) + "</li>");
                out.println("<br/> <br/>");
            }
            out.println("</ol>");
            out.println("</body>");
            out.println("</html>");
    }
}