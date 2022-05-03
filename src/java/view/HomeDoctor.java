package view;

import model.dao.DAOPaciente;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

public class HomeDoctor extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();

        out.print("<html><head><link rel=\"stylesheet\" href=\"Home.css\"></head>");

        resp.sendRedirect("/Servlet-uno/HomeDoctor.html");

        out.print("</html>");

        LoadDriver();
    }

    void LoadDriver() {
        try{
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
        
         DAOPaciente.getInstance(con);
         
         
         
        }catch(Exception ex){
            System.out.print("Unable to connect");
        }
        
       
    }

}


/**/
