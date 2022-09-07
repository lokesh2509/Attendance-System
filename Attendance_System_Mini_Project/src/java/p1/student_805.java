package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class student_805 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println("@import url(https://fonts.googleapis.com/css?family=Montserrat);");
        out.println("* {margin: 0; padding: 0;}");
        out.println("html {");
        out.println("height: 100%;");
        out.println("background-color: #cccccc;}");
        out.println("body {\n"
                + "	font-family: montserrat, arial, verdana;\n"
                + "}");
        out.println("#msform {\n"
                + "	width: 900px;\n"
                + "	margin: 50px auto;\n"
                + "	text-align: center;\n"
                + "	position: relative;\n"
                + "}\n"
                + "#msform fieldset {\n"
                + "	background: white;\n"
                + "	border: 0 none;\n"
                + "	border-radius: 3px;\n"
                + "	box-shadow: 0 0 15px 1px rgba(0, 0, 0, 0.4);\n"
                + "	padding: 20px 30px;\n"
                + "	box-sizing: border-box;\n"
                + "	width: 80%;\n"
                + "	margin: 0 10%;\n"
                + "	position: relative;\n"
                + "}\n"
                + "#msform fieldset:not(:first-of-type) {\n"
                + "	display: none;\n"
                + "}\n"
                + "#msform input, #msform textarea {\n"
                + "	padding: 15px;\n"
                + "	border: 1px solid #ccc;\n"
                + "	border-radius: 3px;\n"
                + "	margin-bottom: 10px;\n"
                + "	width: 100%;\n"
                + "	box-sizing: border-box;\n"
                + "	font-family: montserrat;\n"
                + "	color: #2C3E50;\n"
                + "	font-size: 13px;\n"
                + "}\n"
                + "#msform .action-button {\n"
                + "	width: 300px;\n"
                + "        background: #ff6633;\n"
                + "	font-weight: bold;\n"
                + "	color: white;\n"
                + "	border: 0 none;\n"
                + "	border-radius: 1px;\n"
                + "	cursor: pointer;\n"
                + "	padding: 10px 5px;\n"
                + "	margin: 10px 5px;\n"
                + "}\n"
                + "#msform .action-button:hover, #msform .action-button:focus {\n"
                + "	box-shadow: 0 0 0 2px white, 0 0 0 3px #27AE60;\n"
                + "}\n"
                + ".fs-title {\n"
                + "	font-size: 15px;\n"
                + "	text-transform: uppercase;\n"
                + "	color: #ff6633;\n"
                + "	margin-bottom: 10px;\n"
                + "        \n"
                + "}\n"
                + ".fs-subtitle {\n"
                + "	font-weight: normal;\n"
                + "	font-size: 13px;\n"
                + "	color: #ff6633;\n"
                + "	margin-bottom: 20px;\n"
                + "}\n"
                + "\n"
                + ".img {\n"
                + "  box-shadow: 0 0 15px 1px rgba(0, 0, 0, 0.4);\n"
                + "}\n"
                + "\n" + "table {\n"
                + "  border-collapse: collapse;\n"
                + "  width: 100%;\n"
                + "}\n"
                + "\n"
                + "th, td {\n"
                + "  padding: 8px;\n"
                + "  text-align: left;\n"
                + "  border-bottom: 1px solid #DDD;\n"
                + "}\n"
                + "\n"
                + "tr:hover {background-color: #D6EEEE;}"
                + "        </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src=\"tcsc banner.jpg\" alt=\"TCSC Banner\" width=\"1535\" height=\"150\" class=\"img\">");
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select * from student_805");
            out.println("<form id=\"msform\" method=\"get\" action=\"watch_attendance\">");
            out.println("<fieldset>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>Date</th>");
            out.println("<th>Subject</th>");
            out.println("<th>Attendance</th>");
            out.println("</tr>");
            while (res.next()) {
                out.println("<tr>");
                out.println("<td>" + res.getString(1) + "</td>");
                out.println("<td>" + res.getString(2) + "</td>");
                out.println("<td>" + res.getString(3) + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        } catch (Exception e) {
            out.println(e);
        }
        out.println("</fieldset>");
        out.println("</form>");
        out.println("<body>");
        out.println("</html>");
    }
}
