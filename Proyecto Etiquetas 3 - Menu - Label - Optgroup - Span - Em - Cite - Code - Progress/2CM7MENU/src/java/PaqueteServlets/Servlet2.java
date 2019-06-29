
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
            String cantidadItems = (String) session.getAttribute("cantidadItems");
            int cantidadItemsInt = Integer.parseInt(cantidadItems);
           
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<div style=\"background:yellow;border:1px solid #cccccc;padding: 10px;\" contextmenu=\"mymenu\"> Picale aqui para ver el menu");
            out.println("<menu type='context' id='mymenu'>");
            for(int i = 0; i < cantidadItemsInt; i++)
            {
                out.println("<menuitem label=' " +  request.getParameter("label" + i) + "' onclick=\"window.open('//" + request.getParameter("href" + i) +"');\"> </menuitem>");
            }  
            out.println("</menu>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
    }
}
