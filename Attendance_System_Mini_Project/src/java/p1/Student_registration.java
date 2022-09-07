package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student_registration extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String Name = request.getParameter("std_name");
        String std_class = request.getParameter("std_class");
        String ID = request.getParameter("std_id");
        String phone = request.getParameter("std_phone");
        String email = request.getParameter("std_email");
        String password = request.getParameter("std_pass");
        String confirm_password = request.getParameter("std_cpass");
        String next = request.getParameter("register");

        if (password.equals(confirm_password)) {
            if (next.equals("Register")) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement pst = con.prepareStatement("insert into student_table values(?,?,?,?,?,?)");
                    pst.setString(1, ID);
                    pst.setString(2, Name);
                    pst.setString(3, std_class);
                    pst.setString(4, email);
                    pst.setString(5, phone);
                    pst.setString(6, password);
                    int row = pst.executeUpdate();
                    out.println("<h1>" + row + "Inserted Succesfullyyyyy");
                } catch (Exception e) {
                    out.println(e);
                }
                RequestDispatcher rd = request.getRequestDispatcher("Student_login.html");
                rd.forward(request, response);
            }

        } else {
            out.println("Password Doesn't Match");
            RequestDispatcher rd = request.getRequestDispatcher("/Student_registration.html");
            rd.include(request, response);
        }
    }

}
