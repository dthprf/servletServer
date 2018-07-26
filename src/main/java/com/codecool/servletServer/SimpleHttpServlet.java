package com.codecool.servletServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.google.common.collect.ImmutableMap;
import org.jtwig.web.servlet.JtwigRenderer;

public class SimpleHttpServlet extends HttpServlet {
    private final JtwigRenderer renderer = JtwigRenderer.defaultRenderer();

    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().write("<html><body>GET response</body></html>");
    }
}