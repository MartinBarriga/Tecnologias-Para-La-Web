
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
            String numeroAddress = (String) session.getAttribute("numeroAddress");
            String numeroLineas = (String) session.getAttribute("numeroLineas");
            int numeroAddressInt = Integer.parseInt(numeroAddress);
            int numeroLineasInt = Integer.parseInt(numeroLineas);
           
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < numeroAddressInt; i++)
            {
                out.println("Address " + i);
                out.println("<br/>");
                out.println("<br/>");
                for( int j = 0; j < numeroLineasInt; j++)
                {
                    out.println(request.getParameter("valor" + i + j));
                    out.println("<br/>");
                    out.println("<br/>");
                }
                out.println("<br/>");
                out.println("<br/>");
            }  
            
            out.println("</body>");
            out.println("</html>");
    }
}
