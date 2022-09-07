package p1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Class_A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String Date = request.getParameter("date");
        String subject = request.getParameter("subject");
        String std_22601_radio = request.getParameter("22601");
        String std_22602_radio = request.getParameter("22602");
        String std_22603_radio = request.getParameter("22603");
        String std_22604_radio = request.getParameter("22604");
        String std_22605_radio = request.getParameter("22605");
        String btn = request.getParameter("give_atd_class_a");

        if (btn.equals("Give Attendance")) {
            if (std_22601_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22601");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22601");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22602_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22602");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22602");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22603_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22603");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22603");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22604_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22604");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22604");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22605_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22605");
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
                    PreparedStatement ps = con.prepareStatement("insert into Class_A values(?,?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, "22605");
                    ps.setString(3, subject);
                    ps.setString(4, "Absent");
                    int row = ps.executeUpdate();
                    out.println("<h1>" + row + " Attendance Marked");
                } catch (Exception e) {
                    out.println(e);

                }
            }

        //student table
            if (std_22601_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_601 values(?,?,?)");
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
                    PreparedStatement ps = con.prepareStatement("insert into student_601 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }
            }

            if (std_22602_radio != null) {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into student_602 values(?,?,?)");
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
                    PreparedStatement ps = con.prepareStatement("insert into student_602 values(?,?,?)");
                    ps.setString(1, Date);
                    ps.setString(2, subject);
                    ps.setString(3, "Absent");
                    int row = ps.executeUpdate();
                } catch (Exception e) {
                    out.println(e);

                }

                if (std_22603_radio != null) {
                    try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                        PreparedStatement ps = con.prepareStatement("insert into student_603 values(?,?,?)");
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
                        PreparedStatement ps = con.prepareStatement("insert into student_603 values(?,?,?)");
                        ps.setString(1, Date);
                        ps.setString(2, subject);
                        ps.setString(3, "Absent");
                        int row = ps.executeUpdate();
                    } catch (Exception e) {
                        out.println(e);

                    }
                }
                if (std_22604_radio != null) {
                    try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                        PreparedStatement ps = con.prepareStatement("insert into student_604 values(?,?,?)");
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
                        PreparedStatement ps = con.prepareStatement("insert into student_604 values(?,?,?)");
                        ps.setString(1, Date);
                        ps.setString(2, subject);
                        ps.setString(3, "Absent");
                        int row = ps.executeUpdate();
                    } catch (Exception e) {
                        out.println(e);

                    }
                }
                if (std_22605_radio != null) {
                    try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                        PreparedStatement ps = con.prepareStatement("insert into student_605 values(?,?,?)");
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
                        PreparedStatement ps = con.prepareStatement("insert into student_605 values(?,?,?)");
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
}
