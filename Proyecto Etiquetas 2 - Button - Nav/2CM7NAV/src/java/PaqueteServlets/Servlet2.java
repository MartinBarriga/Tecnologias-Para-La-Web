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
            String cantidadNavs = (String) session.getAttribute("cantidadNavs");
            session.setAttribute ("cantidadArticulos", cantidadNavs);
            int cantidadNavsInt = Integer.parseInt(cantidadNavs);
            int j;
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet3' method = 'get' >");
            for(int i = 0; i < cantidadNavsInt; i++)
            {
                out.println("Nav " + i);
                out.println("<br/> <br/>");
                session.setAttribute(("cantidadLinks" + i),request.getParameter("cantidadLinks" + i));
                for(j = 0; j < Integer.parseInt(request.getParameter("cantidadLinks" + i)); j++)
                {
                    out.println("Introduce el href" + j +": <input type = 'text' name = 'href"+ i +j+ "' />");
                    out.println("Introduce el texto" + j +": <input type = 'text' name = 'texto"+ i +j+ "' />");
                    out.println("<br/> <br/>");
                }
                out.println("<br/> <br/> <br/> <br/>");
                
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}

