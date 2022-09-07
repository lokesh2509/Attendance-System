package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home_Faculty extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String atd_btn = request.getParameter("atd_btn");
        String choice = request.getParameter("choice");

        if (choice.equals("Choose")) {
            if (atd_btn.equals("Watch Student Attendance")) {
                RequestDispatcher rd = request.getRequestDispatcher("watch_attendance.html");
                rd.forward(request, response);
            } else if (atd_btn.equals("Give Student Attendance")) {
                RequestDispatcher rd = request.getRequestDispatcher("giveattendance.html");
                rd.forward(request, response);
            }
        }

    }

}
