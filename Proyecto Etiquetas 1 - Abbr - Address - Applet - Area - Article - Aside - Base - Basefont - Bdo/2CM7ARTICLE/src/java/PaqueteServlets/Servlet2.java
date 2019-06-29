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
            String cantidadArticulos = (String) session.getAttribute("cantidadArticulos");
            session.setAttribute ("cantidadArticulos", cantidadArticulos);
            int cantidadArticulosInt = Integer.parseInt(cantidadArticulos);
            int j;
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet3' method = 'get' >");
            for(int i = 0; i < cantidadArticulosInt; i++)
            {
                out.println("Articulo " + i);
                out.println("<br/> <br/>");
                session.setAttribute(("cantidadH" + i),request.getParameter("cantidadH" + i));
                for(j = 0; j < Integer.parseInt(request.getParameter("cantidadH" + i)); j++)
                {
                    out.println("Introduce el texto de h" + j +": <input type = 'text' name = 'h"+ i +j+ "' />");
                    out.println("<br/> <br/>");
                }
                session.setAttribute(("cantidadP" + i),request.getParameter("cantidadP" + i));
                for(j = 0; j < Integer.parseInt(request.getParameter("cantidadP" + i)); j++)
                {
                    out.println("Introduce el texto de p" + j +": <input type = 'text' name = 'p"+i + j+ "' />");
                    out.println("<br/> <br/> <br/>");
                }
                
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}

