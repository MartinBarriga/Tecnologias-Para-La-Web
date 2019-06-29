
package PaqueteServlet;
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
            throws ServletException, IOException {
            String filas = request.getParameter("filas");
            String columnas = request.getParameter("columnas");
            int nfilas = Integer.parseInt(filas);
            int ncolumnas = Integer.parseInt(columnas);
            HttpSession session = request.getSession();
            session.setAttribute("clavefilas", filas);
            session.setAttribute("clavecolumnas", columnas);
            
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action = 'Servlet2' method = 'get'>");
            for(int i = 0 ; i < nfilas; i++)
            {
                for(int j = 0; j < ncolumnas; j++) 
                {
                    out.println("Ingresa el valor de la celda [" +i+"]["+j+"]: <input type = 'text' name = 'valor" + i + j +"' />" );
                    out.println("<br/>");
                }
            }
            out.println("<input type = 'submit' />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}

