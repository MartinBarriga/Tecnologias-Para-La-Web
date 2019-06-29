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
            throws ServletException, IOException 
    {
            response.setContentType("text/html;charset=UTF-8");
            HttpSession Session=request.getSession();
            String cantidadImagenes = (String) Session.getAttribute("cantidadImagenes");
            int cantidadImagenesInt=Integer.parseInt(cantidadImagenes);
            String ruta=request.getParameter("ruta");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<base href= '" + ruta + "' target=\"_blank\">");
            out.println("</head>");
            out.println("<body>");
            for(int i=0; i<cantidadImagenesInt; i++)
            {
                out.println("<img src='"+request.getParameter("imagen"+i)+"'  width = '" + request.getParameter("width" + i) + "' height= '"+ request.getParameter("height" + i) + "' alt='"+ i +"' >");
            }
            
            out.println("</body>");
            out.println("</html>");
    }

}
