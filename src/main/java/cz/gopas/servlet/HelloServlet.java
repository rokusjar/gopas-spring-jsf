package cz.gopas.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import org.springframework.web.context.support.*;
import cz.gopas.service.*;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
    IOException {
        WebApplicationContext applicationContext =
            WebApplicationContextUtils.getWebApplicationContext(getServletContext());

        HelloService helloService = applicationContext.getBean(HelloService.class);
        resp.getOutputStream().write(helloService.getFile(req.getParameter("name")));
    }
}
