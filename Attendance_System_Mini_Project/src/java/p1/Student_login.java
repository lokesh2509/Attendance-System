package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student_login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("std_name");
        String password = request.getParameter("std_pass");
        String login_btn = request.getParameter("login");

        if (login_btn.equals("Login")) {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Attendance", "root", "root");
                Statement stmt = con.createStatement();
                ResultSet res = stmt.executeQuery("select * from student_table");
                while (res.next()) {
                    String id = res.getString(1);
                    String uname = res.getString(2);
                    String pass = res.getString(6);
                    if (username.equals(id) && password.equals(pass)) {
                        out.println("<!DOCTYPE html>\n"
                                + "<!--\n"
                                + "To change this license header, choose License Headers in Project Properties.\n"
                                + "To change this template file, choose Tools | Templates\n"
                                + "and open the template in the editor.\n"
                                + "-->\n"
                                + "<html>\n"
                                + "    <head>\n"
                                + "        <title>Student Home Page</title>\n"
                                + "        <meta charset=\"UTF-8\">\n"
                                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                                + "        <style>\n"
                                + "@import url(https://fonts.googleapis.com/css?family=Montserrat);\n"
                                + "\n"
                                + "\n"
                                + "* {margin: 0; padding: 0;}\n"
                                + "\n"
                                + "html {\n"
                                + "	height: 100%;\n"
                                + "        background-color: #cccccc;\n"
                                + "}\n"
                                + "\n"
                                + "body {\n"
                                + "	font-family: montserrat, arial, verdana;\n"
                                + "}\n"
                                + "#msform {\n"
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
                                + "\n"
                                + "a:link, a:visited {\n"
                                + "  background-color: #ff6633;\n"
                                + "  color: white;\n"
                                + "  padding: 15px 25px;\n"
                                + "  text-align: center;\n"
                                + "  text-decoration: none;\n"
                                + "  display: inline-block;\n"
                                + "}\n"
                                + "\n"
                                + "a:hover, a:active {\n"
                                + "  background-color: red;\n"
                                + "}\n"
                                + "  \n"
                                + "table {\n"
                                + "border-collapse: collapse;\n"
                                + "width: 100%;\n"
                                + "}\n"
                                + "th, td {\n"
                                + "padding: 8px;\n"
                                + "text-align: left;\n"
                                + "border-bottom: 1px solid #DDD;\n"
                                + "}\n"
                                + "tr:hover {background-color: #D6EEEE;}\n"
                                + "\n"
                                + "        </style>\n"
                                + "    </head>\n"
                                + "    <body>\n"
                                + "        <img src=\"tcsc banner.jpg\" alt=\"TCSC Banner\" width=\"1535\" height=\"150\" class=\"img\">\n"
                                + "        <form id=\"msform\" method=\"get\" action=\"Home_Student\">\n"
                                + "            <fieldset>\n"
                                + "                <h3 class=\"fs-title\"><b>" + uname + "'s Home Page</b></h3><br>\n"
                                + "                <table>\n"
                                + "                    <th>Date</th>\n"
                                + "                    <th>Subject</th>\n"
                                + "                    <th>Attendance</th>\n"
                        );
                    }

                    if (username.equals(id)) {
                        Statement stmts = con.createStatement();
                        ResultSet ress = stmts.executeQuery("select * from student_" + id);
                        while (ress.next()) {
                            out.println(
                                    "<tr>\n" + "<td>" + ress.getString(1) + "</td>\n"
                                    + "<td>" + ress.getString(2) + "</td>\n"
                                    + "<td>" + ress.getString(3) + "</td>\n"
                                    + "</tr>");
                        }
                    }
                    out.println("</table>\n"
                            + "            </fieldset>\n"
                            + "        </form>\n"
                            + "    </body>\n"
                            + "</html>\n"
                            + "");

                }
            } catch (Exception e) {
                out.println(e);
            }
        } else {
            out.println("Error in login");
        }
    }

}
