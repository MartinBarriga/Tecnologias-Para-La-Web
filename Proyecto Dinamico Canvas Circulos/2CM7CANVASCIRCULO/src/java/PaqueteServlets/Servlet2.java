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
            HttpSession session=request.getSession();
            String cantidadCirculos=(String)session.getAttribute("cantidadCirculos");
            int cantidadCirculosInt=Integer.parseInt(cantidadCirculos);
            PrintWriter out=response.getWriter();   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");         
            out.println("</head>");
            out.println("<body>");
            out.println("<canvas id='myCanvas' width='800' height='600'> </canvas>");
            out.println("<script>");
            out.println("var canvas = document.getElementById('myCanvas');");
            out.println("var context = canvas.getContext('2d');");
            out.println("context.beginPath();");
            for(int i=0;i<cantidadCirculosInt;i++)
            {
                out.println("context.arc("+request.getParameter("x"+i)+","+request.getParameter("y"+i)+ "," +request.getParameter("r"+i)+ "," +request.getParameter("anguloI"+i)+"*Math.PI," +request.getParameter("anguloF"+i)+"*Math.PI);");
                out.println("context.stroke();");
                out.println("context.fill();");
            }
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");  
    }
}