package org.zerock.jspmvc.calc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalcController", value = "/calc/makeResult")
public class CalcController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        System.out.printf(" num1: %s", num1);
        System.out.printf(" num2: %s", num2);

        response.sendRedirect("/index");
    }
}
