
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
            int cantidadProgressInt = Integer.parseInt((String)session.getAttribute("cantidadProgress"));
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < cantidadProgressInt; i++)
            {
                out.println(request.getParameter("descripcion" + i)+":  <progress value = '" + request.getParameter("estado_actual" + i) + "' max = '" + request.getParameter("estado_final" + i) + "'>");
                out.println("</progress>");
                out.println("<br/> <br/>");
            }
            out.println("</body>");
            out.println("</html>");
    }
}