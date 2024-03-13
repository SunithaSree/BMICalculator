import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/result")
public class ResultServlet extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	try {
	float ht=Float.parseFloat(req.getParameter("height"));
	float wt=Float.parseFloat(req.getParameter("weight"));
	float BMI=wt/(ht*ht);
	req.setAttribute("BMI",BMI);
	RequestDispatcher rd=req.getRequestDispatcher("display");
	rd.forward(req, res);
//	res.setContentType("text/html");
//	PrintWriter pw=res.getWriter();
//	pw.println("<h1>"+BMI+" is the BMI Calculated</h1>");
	}
	catch(Exception e) {
		System.out.println(e);
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html><head><style>"+"body{background-color:pink;color:red;text-align:center;}"+"</style></head><body><h1>Please fill the details!!!</h1></body></html>");
	}
}
}