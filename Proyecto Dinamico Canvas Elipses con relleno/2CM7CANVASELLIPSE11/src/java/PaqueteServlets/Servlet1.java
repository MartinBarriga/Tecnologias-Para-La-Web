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
        String cantidadEllipses=request.getParameter("cantidadEllipses");
        HttpSession session=request.getSession();
        session.setAttribute("cantidadEllipses", cantidadEllipses);
        int cantidadEllipsesInt=Integer.parseInt(cantidadEllipses);
        PrintWriter out=response.getWriter();   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");           
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='Servlet2' method='get'>");
            for(int i=0;i<cantidadEllipsesInt;i++)
            {
                out.println("Elipse " +(i+1)+": ");
                out.println("<br/> <br/> <br/>");
                out.println("Ingresa el color de relleno de la elipse:");
                out.println("<br/> <br/>");
                out.println("color: <input type='text' name='color"+i+"'/>");
                out.println("<br/> <br/>");
                out.println("Ingresa la coordenada del centro:");
                out.println("<br/> <br/>");
                out.println("x: <input type='text' name='x"+i+"'/>");
                out.println("<br/>");
                out.println("y: <input type='text' name='y"+i+"'/>");
                out.println("<br/> <br/>");
                out.println("Ingresa el radio X de la elipse:");
                out.println("<br/> <br/>");
                out.println("rx: <input type='text' name='rx"+i+"'/>");
                out.println("<br/> <br/>");
                out.println("Ingresa el radio Y de la elipse:");
                out.println("<br/> <br/>");
                out.println("ry: <input type='text' name='ry"+i+"'/>");
                out.println("<br/> <br/>");
                out.println("Ingresa el angulo de rotacion de la elipse:");
                out.println("<br/> <br/>");
                out.println("anguloR: <input type='text' name='anguloR"+i+"'/>");
                out.println("<br/> <br/>");
                out.println("Ingresa el angulo de inicio: ");
                out.println("<br/> <br/>");
                out.println("anguloI: <input type='text' name='anguloI"+i+"'/>");
                out.println("<br/> <br/>");
                out.println("Ingresa el angulo de fin: ");
                out.println("<br/> <br/>");
                out.println("anguloF: <input type='text' name='anguloF"+i+"'/>");
                out.println("<br/> <br/> <br/> <br/>");
            }
            out.println("<input type='submit'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        
    }
}