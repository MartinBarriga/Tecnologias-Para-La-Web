
package PaqueteServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Martin
 */
public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        float a, b, c, d, e, f,D, Dx, Dy, x, y;
        a = Float.parseFloat(request.getParameter("parametroA"));
        b = Float.parseFloat(request.getParameter("parametroB"));
        c = Float.parseFloat(request.getParameter("parametroC"));
        
        float determinante = (b*b) - 4*a*c;
        float x1 =( -b + (float)Math.sqrt(determinante) ) / 2*a;
        float x2 =( -b - (float)Math.sqrt(determinante) ) / 2*a;
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ServletEcuaciones</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Solución a nuestra ecuacion de segundo grado</h1>");
        out.println("<br/>");
        out.println("<br/>");
        out.println("La ecuacion:");
        out.println("<br/>");
        out.println("<br/>");
        out.println(a + "x^2 + " + b + "x + " + c + " = 0" );
        out.println("<br/>");
        out.println("<br/>");
        
        
        if(a == 0)
        {
            out.println("La ecuacion no se puede resolver por este metodo, debido a que a es igual a 0, y esto hace que la ecuacion no sea cuadratica");
        }
        else if(determinante < 0)
        {
            out.println("No existen soluciones reales debido a que el determinante es negativo");
        }
        else
        {
            out.println("x1 = " + x1);
            out.println("<br/>");
            out.println("<br/>");
            out.println("x2 = " + x2);
            out.println("<br/>");
            out.println("<br/>");
            if(determinante == 0)
            {
                out.println("Se tienen solo una solucion ya que x1 = x2");
            }
        }
       
        out.println("</body>");
        out.println("</html>");
    }
}
