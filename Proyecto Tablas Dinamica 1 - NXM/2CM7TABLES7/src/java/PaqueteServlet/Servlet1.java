
package PaqueteServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String filas = request.getParameter("filas");
            String columnas = request.getParameter("columnas");
            int nfilas = Integer.parseInt(filas);
            int ncolumnas = Integer.parseInt(columnas);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border = '1'>");
            for(int i = 0; i <nfilas; i++)
            {
                out.println("<tr>"); //esto es table row y se ocupa en las filas
                for(int j = 0; j<ncolumnas; j++)
                {
                    out.println("<td>DATOCOLUMNA</td>"); //esto es table data y es usado para las columnas
                }
                out.println("</tr>");

            }
           
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
    }
}

