package p1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Class_C extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String Date = request.getParameter("date");
        String subject = request.getParameter("subject");
        String std_22801_radio = request.getParameter("22801");
        String std_22802_radio = request.getParameter("22802");
        String std_22803_radio = request.getParameter("22803");
        String std_22804_radio = request.getParameter("22804");
        String std_22805_radio = request.getParameter("22805");
        String btn = request.getParameter("give_atd_class_a");

        if (btn.equals("Give Attendance")) {
            if (std_22801_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22801");
                    ps.setString(3, subject);
                    ps.setString(4, "Present");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22801");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22802_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22802");
                    ps.setString(3, subject);
                    ps.setString(4, "Present");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22802");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22803_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22803");
                    ps.setString(3, subject);
                    ps.setString(4, "Present");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22803");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22804_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22804");
                    ps.setString(3, subject);
                    ps.setString(4, "Present");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22804");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22805_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22805");
                    ps.setString(3, subject);
                    ps.setString(4, "Present");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_C values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22805");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

        //student table
            if (std_22801_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_801 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Present");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_801 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22802_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_802 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Present");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_802 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22803_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_803 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Present");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_803 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }
            if (std_22804_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_804 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Present");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_804 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }
            if (std_22805_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_805 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Present");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_805 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }
        }
    }

}
