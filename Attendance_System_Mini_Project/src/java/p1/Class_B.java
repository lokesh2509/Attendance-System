package p1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Class_B extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String Date = request.getParameter("date");
        String subject = request.getParameter("subject");
        String std_22701_radio = request.getParameter("22701");
        String std_22702_radio = request.getParameter("22702");
        String std_22703_radio = request.getParameter("22703");
        String std_22704_radio = request.getParameter("22704");
        String std_22705_radio = request.getParameter("22705");
        String btn = request.getParameter("give_atd_class_a");

        if (btn.equals("Give Attendance")) {
            if (std_22701_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22701");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22701");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22702_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22702");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22702");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22703_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22703");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22703");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22704_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22704");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22704");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22705_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22705");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_B values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22705");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            //student table
            if (std_22701_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_701 values(?,?,?)");
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
                    PreparedStatement ps = con.prepareStatement("insert into student_701 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22702_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_702 values(?,?,?)");
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
                    PreparedStatement ps = con.prepareStatement("insert into student_702 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22703_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_703 values(?,?,?)");
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
                    PreparedStatement ps = con.prepareStatement("insert into student_703 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }
            if (std_22704_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_704 values(?,?,?)");
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
                    PreparedStatement ps = con.prepareStatement("insert into student_704 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }
            if (std_22705_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_705 values(?,?,?)");
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
                    PreparedStatement ps = con.prepareStatement("insert into student_705 values(?,?,?)");
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
