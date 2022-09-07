package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Drop_page extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String atd_sys = request.getParameter("atd_sys");
        String choice = request.getParameter("choice_btn");

        if ((choice.equals("Choose"))) {
            if (atd_sys.equals("Login_Faculty")) {
                RequestDispatcher rd = request.getRequestDispatcher("Login_Faculty.html");
                rd.forward(request, response);
            } else if (atd_sys.equals("Login_student")) {
                RequestDispatcher rd = request.getRequestDispatcher("Student_login.html");
                rd.forward(request, response);
            } else if (atd_sys.equals("Register")) {
                RequestDispatcher rd = request.getRequestDispatcher("Student_registration.html");
                rd.forward(request, response);
            }
        }

    }

}
