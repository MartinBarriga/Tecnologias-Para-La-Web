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
        String cantidadCirculos=request.getParameter("cantidadCirculos");
        HttpSession session=request.getSession();
        session.setAttribute("cantidadCirculos", cantidadCirculos);
        int cantidadCirculosInt=Integer.parseInt(cantidadCirculos);
        PrintWriter out=response.getWriter();   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");           
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='Servlet2' method='get'>");
            for(int i=0;i<cantidadCirculosInt;i++)
            {
                out.println("Circulo " +(i+1)+": ");
                out.println("<br/> <br/> <br/>");
                out.println("Ingresa la coordenada del centro:");
                out.println("<br/> <br/>");
                out.println("x: <input type='text' name='x"+i+"'/>");
                out.println("<br/>");
                out.println("y: <input type='text' name='y"+i+"'/>");
                out.println("<br/> <br/>");
                out.println("Ingresa el radio del circulo:");
                out.println("<br/> <br/>");
                out.println("r: <input type='text' name='r"+i+"'/>");
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