import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/end")
public class EndServlet extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html><head><style>"+"body{background-color:pink;color:green;text-align:center;margin-top:50px;}"+"</style></head><body><h1>Thankyou for visiting..</h1>"
				+ "<h3>&#169 webees@2024</h3></body></html>");
}
}