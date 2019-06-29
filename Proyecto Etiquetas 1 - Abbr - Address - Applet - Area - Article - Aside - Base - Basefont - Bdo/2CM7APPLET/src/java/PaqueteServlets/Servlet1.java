
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
            String numeroApplets = request.getParameter("numeroApplets");
            int numeroAppletsInt = Integer.parseInt(numeroApplets);
            HttpSession session = request.getSession();
            session.setAttribute("numeroApplets", numeroApplets);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get'>");
            for(int i = 0; i < numeroAppletsInt; i++)
            {
                out.println("Informacion para el applet" + i);
                out.println("<br/>");
                out.println("<br/>");
                out.println("Introduce el nombre del archivo: <input type = 'text' name = 'nombreArchivo"+ i +"' />");
                out.println("<br/>");
                out.println("<br/>");
                out.println("Introduce el ancho: <input type = 'text' name = 'ancho"+ i +"' />");
                out.println("<br/>");
                out.println("<br/>");
                out.println("Introduce el alto: <input type = 'text' name = 'alto"+ i +"' />");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<br/>");
                
            }  
            out.println("<input type = 'submit' />");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
    }
}
