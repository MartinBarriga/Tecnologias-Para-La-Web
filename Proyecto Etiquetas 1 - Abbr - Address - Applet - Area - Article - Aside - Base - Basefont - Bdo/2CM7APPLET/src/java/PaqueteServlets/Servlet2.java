
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
            String numeroApplets = (String) session.getAttribute("numeroApplets");
            int numeroAppletsInt = Integer.parseInt(numeroApplets);
           
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < numeroAppletsInt; i++)
            {
                out.println("Applet " + i);
                out.println("<br/>");
                out.println("<br/>");
                out.println("<applet code = '" + request.getParameter("nombreArchivo" + i) + ".class' width = '" + request.getParameter("ancho" + i) + "' height = '" + request.getParameter("alto" + i) + "' </applet>");
            }  
            
            out.println("</body>");
            out.println("</html>");
    }
}
