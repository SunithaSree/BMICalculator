import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/calc")
public class CalculationServlet extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
res.sendRedirect("Calculationpage.html");
}
}
