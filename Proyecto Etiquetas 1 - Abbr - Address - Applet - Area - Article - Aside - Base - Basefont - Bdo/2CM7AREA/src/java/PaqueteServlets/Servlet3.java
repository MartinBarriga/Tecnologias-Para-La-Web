
package PaqueteServlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet3 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession();
            String numeroAreas = (String) session.getAttribute("cantidadAreas");
            int numeroAreasInt = Integer.parseInt(numeroAreas);
            String forma;
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            out.println("<img src = 'imagen.png' widht = '1000' height = '750' alt = 'imagen' usemap = '#Imagenmap' >");
            out.println("<map name = 'Imagenmap' >");
            for(int i = 0; i < numeroAreasInt; i++)
            {
                forma = (String) session.getAttribute("forma" + i);
                out.println("<area shape = '" + forma + "' coords = '");
                
               if("circle".equals(forma) || "triangle".equals(forma))
                {
                    for(int j = 0; j < 3; j++)
                    {
                        out.println( request.getParameter("coordenada" + i + j));
                        if( j < 2 ) out.println(",");
                    }
                }
                else 
                {
                    for(int j = 0; j < 4; j++)
                    {
                        out.println( request.getParameter("coordenada" + i + j));
                        if( j < 3) out.println(",");
                    }
                }
               out.println("' alt = '" + request.getParameter("alt" +i) + "'  href = '" + request.getParameter("href" + i)+ "' />");
            }  
            out.println("</map>");
            out.println("</body>");
            out.println("</html>");
    }
}
