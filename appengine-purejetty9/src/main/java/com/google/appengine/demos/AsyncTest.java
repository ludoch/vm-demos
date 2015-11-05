package com.google.appengine.demos;
// enable async in the servlet

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/simplesse"})
public class AsyncTest extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
          throws IOException, ServletException {

    // set content type
    res.setContentType("text/event-stream");
    res.setCharacterEncoding("UTF-8");

    String msg = req.getParameter("msg");

    PrintWriter writer = res.getWriter();

    // send SSE
    writer.write("data: " + msg + "\n\n");
  }
}
