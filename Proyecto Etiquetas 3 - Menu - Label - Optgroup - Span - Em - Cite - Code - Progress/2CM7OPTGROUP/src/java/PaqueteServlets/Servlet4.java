
package PaqueteServlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet4 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession();
            String cantidadClasificaciones = (String) session.getAttribute("cantidadClasificaciones");
            int cantidadClasificacionesInt = Integer.parseInt(cantidadClasificaciones);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<select>");
            for(int i = 0; i < cantidadClasificacionesInt; i++)
            {
                String clasificacion = (String) session.getAttribute("clasificacion" + i);
                out.println("<optgroup label = '" + clasificacion+ "'>");
                String cantidadOpciones = (String) session.getAttribute("cantidadOpciones" +i);
                int cantidadOpcionesInt = Integer.parseInt(cantidadOpciones);
                for(int j = 0; j < cantidadOpcionesInt; j++ )
                {
                    out.println("<option value = '" + request.getParameter("opcion" + i + j)+ "'> "+ request.getParameter("opcion" + i + j)+ "</option>");
                }
                out.println("</optgroup>");
            }
            out.println("</select>");
            out.println("</body>");
            out.println("</html>");
    }
}
