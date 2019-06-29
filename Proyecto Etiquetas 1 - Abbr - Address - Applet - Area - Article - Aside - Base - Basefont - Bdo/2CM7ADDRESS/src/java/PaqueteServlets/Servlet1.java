
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
            String numeroAddress = request.getParameter("numeroAddress");
            int numeroAddressInt = Integer.parseInt(numeroAddress);
             String numeroLineas = request.getParameter("numeroLineas");
            int numeroLineasInt = Integer.parseInt(numeroLineas);
            
            HttpSession session = request.getSession();
            session.setAttribute("numeroAddress", numeroAddress);
            session.setAttribute("numeroLineas", numeroLineas);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get'>");
            for(int i = 0; i < numeroAddressInt; i++)
            {
                out.println("Informacion para el adress " + i);
                out.println("<br/>");
                out.println("<br/>");
                for(int j = 0; j < numeroLineasInt; j++)
                {
                    out.println("Dato " + j +": <input type = 'text' name = 'valor"+ i + j +"' />");
                    out.println("<br/>");
                    out.println("<br/>");
                }
                
                out.println("<br/>");
                out.println("<br/>");
            }  
            out.println("<input type = 'submit' />");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
    }
}
