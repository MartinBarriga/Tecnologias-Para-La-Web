
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
            String cantidadLabels = (String) session.getAttribute("cantidadLabels");
            String pregunta = (String) session.getAttribute("pregunta");
            int cantidadLabelsInt = Integer.parseInt(cantidadLabels);
           
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println(pregunta + "<br/> <br/>");
            out.println("<form action = 'Servlet4' method = 'get'");
            
            for(int i = 0; i < cantidadLabelsInt; i++)
            {
                out.println("<label for = '" + request.getParameter("respuesta" + i) + "'>"+request.getParameter("respuesta" + i) +"</label>");
                out.println("<input type='radio' "+ " name= 'valorFinal'" + " id='"+ request.getParameter("respuesta" + i) +"' value='" +request.getParameter("respuesta" + i)+"'><br/><br/>");
            }  
            out.println("<input type = 'submit' />");
            out.println("</body>");
            out.println("</html>");
    }
}
