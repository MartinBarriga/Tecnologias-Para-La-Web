
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
            String cantidadTextos = (String) session.getAttribute("cantidadTextos");
            int cantidadTextosInt = Integer.parseInt(cantidadTextos);
           
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < cantidadTextosInt; i++)
            {
                out.println("Texto " + i);
                out.println("<br/> <br/>");
                out.println("<basefont color = '" + request.getParameter("color" + i) + "' size = '" + request.getParameter("size"+ i) + "' >" + request.getParameter("texto" + i));
                out.println("<br/> <br/> <br/>");
            }  
            
            out.println("</body>");
            out.println("</html>");
    }
}
