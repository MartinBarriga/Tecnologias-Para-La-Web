
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
            String cantidadProgress = request.getParameter("cantidadProgress");
            int cantidadProgressInt = Integer.parseInt(cantidadProgress);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadProgress",cantidadProgress);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get' />");
            for(int i = 0; i < cantidadProgressInt; i++)
            {
                out.println("Progress " + i + "<br/> <br/> <br/>");
                out.println("Introduce la descripcion de tu proceso: <input type = 'text' name = 'descripcion" + i + "' /> <br/> <br/>");
                out.println("Introduce el estado actual de tu proceso: <input type = 'text' name = 'estado_actual" + i + "' /> <br/> <br/>");
                out.println("Introduce el estado final de tu proceso: <input type = 'text' name = 'estado_final" + i + "' /> <br/> <br/> <br/>");
                
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
           
            out.println("</body>");
            out.println("</html>");
    }
}