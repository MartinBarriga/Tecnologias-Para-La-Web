package PaqueteServlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet3 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession();
            String cantidadAsides = (String) session.getAttribute("cantidadAsides");
            int cantidadAsidesInt = Integer.parseInt(cantidadAsides);
            int j;
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");           
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < cantidadAsidesInt; i++)
            {
                out.println("Articulo "+ i);
                out.println("<br/> <br/>");
                out.println("<aside>");
                for(j = 0; j < Integer.parseInt((String)session.getAttribute("cantidadH" + i)); j++)
                {
                    out.println("<h" +j+"> " + request.getParameter("h" + i + j) +"</h" + j+ ">");
                    out.println("<br/>");
                }
                for(j = 0; j < Integer.parseInt((String)session.getAttribute("cantidadP" + i)); j++)
                {
                    out.println("<p" +j+"> " + request.getParameter("p" + i + j) +"</p" + j+ ">");
                    out.println("<br/>");
                }
                out.println("</aside>");
                out.println("<br/> <br/> <br/>");
            }
            out.println("</body>");
            out.println("</html>");
    }
}

