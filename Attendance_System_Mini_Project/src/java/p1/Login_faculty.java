package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login_faculty extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("fac_name");
        String password = request.getParameter("fac_pass");
        String login_btn = request.getParameter("login");

        if (login_btn.equals("Login")) {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                Statement stmt = con.createStatement();
                ResultSet res = stmt.executeQuery("select * from faculty_table");
                while (res.next()) {
                    String uname = res.getString(2);
                    String pass = res.getString(5);
                    if (username.equals(uname) && password.equals(pass)) {
                        RequestDispatcher rd = request.getRequestDispatcher("Faculty_Home_page.html");
                        rd.forward(request, response);
                    } else {
                        out.println("Invalid Credentials");
                        RequestDispatcher rd = request.getRequestDispatcher("Login_Faculty.html");
                        rd.include(request, response);
                        break;
                    }
                }
            } catch (Exception e) {
                out.println(e);
            }
        } else {
            out.println("Error in login");
        }
    }

}
