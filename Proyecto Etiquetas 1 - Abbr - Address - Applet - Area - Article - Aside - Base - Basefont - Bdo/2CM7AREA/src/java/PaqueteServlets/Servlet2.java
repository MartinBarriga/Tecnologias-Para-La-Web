
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
            String cantidadAreas = (String) session.getAttribute("cantidadAreas");
            int cantidadAreasInt = Integer.parseInt(cantidadAreas);
            String forma;
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet3' method = 'get'>");
            for(int i = 0; i < cantidadAreasInt; i++)
            {
                
                out.println("Area " + i);
                out.println("<br/>");
                out.println("<br/>");
                forma = request.getParameter("forma" + i);
                session.setAttribute(("forma" + i), forma);
                if("circle".equals(forma) || "triangle".equals(forma))
                {
                    for(int j = 0; j < 3; j++)
                    {
                        out.println("Introduce la coordenada " + j +" <input type = 'text' name = 'coordenada" + i + j + "' />");
                        out.println("<br/>");
                    }
                }
                else 
                {
                    for(int j = 0; j < 4; j++)
                    {
                        out.println("Introduce la coordenada " + j +" <input type = 'text' name = 'coordenada" + i + j + "' />");
                        out.println("<br/>");
                    }
                }
                out.println("<br/>");
                out.println("Introduce el href: <input type = 'text' name = 'href"+ i +"' />");
                out.println("<br/>");
                out.println("Introduce el alt: <input type = 'text' name = 'alt"+ i +"' />");
                out.println("<br/><br/>");
            }  
            out.println("<input type = 'submit' />");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
    }
}

