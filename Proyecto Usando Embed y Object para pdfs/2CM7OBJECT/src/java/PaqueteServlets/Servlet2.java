
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
            int cantidadObjetosInt = Integer.parseInt((String)session.getAttribute("cantidadObjetos"));
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < cantidadObjetosInt; i++)
            {
                out.println("<object width = '1000' height = '1000' data = '" + request.getParameter("pdf" + i) + ".pdf'> </object> <br/> <br/> <br/> ");
                out.println("<br/> <br/>");
            }
            out.println("</body>");
            out.println("</html>");
    }
}