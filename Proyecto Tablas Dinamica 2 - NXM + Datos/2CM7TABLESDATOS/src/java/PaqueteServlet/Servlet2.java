
package PaqueteServlet;
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
            HttpSession session = request.getSession();
            int ncelda;
            int nfilas = Integer.parseInt((String) session.getAttribute("clavefilas"));
            int ncolumnas = Integer.parseInt((String) session.getAttribute("clavecolumnas"));
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Tu tabla resultante es la siguiente:");
            out.println("<br/>");
            out.println("<br/>");
            out.println("<table border = '1'>");
            for(int i = 0; i <nfilas; i++)
            {
                out.println("<tr>"); //esto es table row y se ocupa en las filas
                for(int j = 0; j<ncolumnas; j++)
                {
                    ncelda = Integer.parseInt(request.getParameter("valor"+i+j));
                    out.println("<td>"+ncelda+"</td>"); //esto es table data y es usado para las columnas
                }
                out.println("</tr>");

            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
    }
}
