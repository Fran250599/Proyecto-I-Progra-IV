package view;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HomePatient extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();

        out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

        resp.sendRedirect("/Servlet-uno/HomePatient.jsp");

        out.print("</html>");  
    }

}


/**/
