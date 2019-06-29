
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
            String cantidadNavs = request.getParameter("cantidadNavs");
            int cantidadNavsInt = Integer.parseInt(cantidadNavs);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadNavs", cantidadNavs);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get' >");
            for(int i = 0; i < cantidadNavsInt; i++)
            {
                out.println("Nav " + i);
                out.println("<br/>");
                out.println("<br/>");
                
                out.println("Introduce la cantidad de links: <input type = 'text' name = 'cantidadLinks" + i+ "' />");
                out.println("<br/> <br/> <br/>");
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}