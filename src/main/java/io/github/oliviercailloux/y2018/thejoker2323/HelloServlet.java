package io.github.oliviercailloux.y2018.thejoker2323;



import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("myapp/hello")
public class HelloServlet extends HttpServlet {
	private String msg;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public String sayHello() {
    msg = "Hello world";
    return msg;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pr=response.getWriter();
		response.setCharacterEncoding(StandardCharsets.UTF_8.name());
		response.setContentType("text/plain");
		response.setLocale(Locale.ENGLISH);
		pr.print(sayHello());
		pr.flush();
		pr.close();
	}
	

}
