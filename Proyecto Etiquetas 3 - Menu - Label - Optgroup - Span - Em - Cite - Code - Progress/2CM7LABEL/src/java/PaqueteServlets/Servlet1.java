
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
            String cantidadLabels = request.getParameter("cantidadLabels");
            String pregunta = request.getParameter("pregunta");
            int cantidadLabelsInt = Integer.parseInt(cantidadLabels);
            HttpSession session = request.getSession();
            session.setAttribute("cantidadLabels", cantidadLabels);
            session.setAttribute("pregunta", pregunta);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get'>");
            out.println("Introduce las posibles respuestas para -> " + pregunta + " <br/> <br/> <br/>");
            for(int i = 0; i < cantidadLabelsInt; i++)
            {
                out.println("Introduce la respuesta " + i + ": <input type = 'text' name = 'respuesta"+ i +"' /> <br/> <br/>");
            }  
            out.println("<input type = 'submit' />");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
    }
}
