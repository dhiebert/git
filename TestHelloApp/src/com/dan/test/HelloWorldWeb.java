package com.dan.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 * dans tests
 * adding more text ... going to merge.
 * blah blah blah
 */
@WebServlet("/HelloWorldWeb")
public class HelloWorldWeb extends HttpServlet {
	private static final long serialVersionUID = 5L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldWeb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("Hello World Start Test Dan Person");
		String name=request.getParameter("person");		
		PrintWriter out = response.getWriter();		
		out.println("<html><head><title>Hello World Person</title></head>");
		out.println("<body>");
        out.println("<br>HelloWorld<br>");
		out.println("<p>");
		out.println("Dans Hello World Person = "+ name);
		out.println("</body></html>");						
		out.flush();	
		out.close();
		System.out.println("Hello World Done Person");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
