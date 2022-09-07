package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Give_attendance extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String class_opt = request.getParameter("give_atd");
        if (class_opt.equals("Class A")) {
            RequestDispatcher rd = request.getRequestDispatcher("Class_A.html");
            rd.forward(request, response);
        } else if (class_opt.equals("Class B")) {
            RequestDispatcher rd = request.getRequestDispatcher("Class_B.html");
            rd.forward(request, response);
        } else if (class_opt.equals("Class C")) {
            RequestDispatcher rd = request.getRequestDispatcher("Class_C.html");
            rd.forward(request, response);
        }
    }

}
