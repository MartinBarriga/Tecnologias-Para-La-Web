
package Servlets;

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
public class ServletEcuaciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        float a, b, c, d, e, f,D, Dx, Dy, x, y;
        a = Float.parseFloat(request.getParameter("parametroA"));
        b = Float.parseFloat(request.getParameter("parametroB"));
        c = Float.parseFloat(request.getParameter("parametroC"));
        d = Float.parseFloat(request.getParameter("parametroD"));
        e = Float.parseFloat(request.getParameter("parametroE"));
        f = Float.parseFloat(request.getParameter("parametroF"));
        
        D = a*e - d*b;
        Dx = c*e - f*b;
        Dy = a*f - d*c;
        x = Dx / D;
        y = Dy / D;
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ServletEcuaciones</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Solución a nuestro sistema de ecuaciones</h1>");
        out.println("<br/>");
        out.println("<br/>");
        out.println("Las ecuaciones:");
        out.println("<br/>");
        out.println("<br/>");
        
        if(b < 0)out.println(a + "x - " + b + "y = " + c);
        else out.println(a + "x + " + b + "y = " + c);
        out.println("<br/>");
        if(e < 0)out.println(d + "x - " + e + "y = " + f);
        else out.println(d + "x + " + e + "y = " + f);
        out.println("<br/>");
        out.println("<br/>");
        out.println("<br/>");
        
        if(D == 0)
        {
            if(x!=0 || y!=0) out.println("No tienen solucion");
            else{
                out.println("Tienen soluciones infinitas");
            }
        }
        else{
            out.println("Tienen como solucion:");
            out.println("<br/>");
            out.println("<br/>");
            out.println("x = " + x);
            out.println("<br/>");
            out.println("<br/>");
            out.println("y = " + y);
        }
        
        out.println("");
        out.println("</body>");
        out.println("</html>");
    }
}
