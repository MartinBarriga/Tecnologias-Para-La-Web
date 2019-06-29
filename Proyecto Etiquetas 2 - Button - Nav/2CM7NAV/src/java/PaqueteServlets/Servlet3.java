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
            String cantidadNavs = (String) session.getAttribute("cantidadNavs");
            int cantidadNavsInt = Integer.parseInt(cantidadNavs);
            int j;
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");           
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i < cantidadNavsInt; i++)
            {
                out.println("Nav "+ i);
                out.println("<br/> <br/>");
                out.println("<nav>");
                for(j = 0; j < Integer.parseInt((String)session.getAttribute("cantidadLinks" + i)); j++)
                {
                    out.println("<a href = '" + request.getParameter("href" + i +j)+ "' >" + request.getParameter("texto"+ i + j) + "</a>");
                    out.println("<br/>");
                }
                out.println("</nav>");
                out.println("<br/> <br/> <br/>");
            }
            out.println("</body>");
            out.println("</html>");
    }
}

