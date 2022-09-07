package p1;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Watch_Attendance extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String atd = request.getParameter("class");
        String btn = request.getParameter("submit");
        if (btn.equals("Choose")) {
            if (atd.equals("class")) {
                RequestDispatcher rd = request.getRequestDispatcher("Choice_Class.html");
                rd.forward(request, response);
            } else if (atd.equals("roll")) {
                RequestDispatcher rd = request.getRequestDispatcher("Choice_rollNumber.html");
                rd.forward(request, response);
            }
        }
    }
}
