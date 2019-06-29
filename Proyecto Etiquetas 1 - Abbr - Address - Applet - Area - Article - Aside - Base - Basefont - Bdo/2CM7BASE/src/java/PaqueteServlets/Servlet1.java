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
            throws ServletException, IOException 
    {
            response.setContentType("text/html;charset=UTF-8");
            String cantidadImagenes= request.getParameter("cantidadImagenes");
            String ruta = request.getParameter("ruta");
            int cantidadImagenesInt = Integer.parseInt(cantidadImagenes);
            HttpSession Session=request.getSession();
            Session.setAttribute("ruta", ruta);
            Session.setAttribute("cantidadImagenes", cantidadImagenes);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='Servlet2' method='get'>");
            for(int i = 0; i < cantidadImagenesInt; i++)
            {
                out.println("Introduce el nombre de la imagen " + i + ": <input type = 'text' name = 'imagen" + i + "' />");
                out.println("<br/> <br/>");
                out.println("Introduce el alto: <input type = 'text' name = 'height" + i + "' />");
                out.println("<br/> <br/>");
                out.println("Introduce el ancho: <input type = 'text' name = 'width" + i + "' />");
                out.println("<br/> <br/> <br/> <br/>");
            }
            out.println("<input type='submit' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

}
