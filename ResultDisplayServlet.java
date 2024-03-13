import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/display")
public class ResultDisplayServlet extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
  float BMI=(float) req.getAttribute("BMI");
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
//	pw.println("<h1>"+BMI+" is the BMI Calculated</h1>");
	pw.println("<html><head><style>"+"body{background-color:pink;}"+"</style></head><body><h1>"+BMI+" is your BMI</h1>");
	if(BMI<18.5) {
		pw.println("<h2 style=\"color:yellow;\">Underweight</h2>");
		pw.println("<img src=\"underweight.png\" width=\"200px\" height=\"200px\"></img>");
		pw.println("<h3>Excercise recommended:</h3>");
		pw.println("<p>Focus on building muscle & Cardio and Core</p>");
		pw.println("<h3>Food recommendations:</h3>");
		pw.println("<p>Breakfast:</p>");
		pw.println("<ul>");
		pw.println("  <li>Oatmeal with berries and nuts, topped with full-fat milk and honey</li>");
		pw.println("  <li>Scrambled eggs with whole-wheat toast and avocado</li>");
		pw.println("  <li>Greek yogurt smoothie with protein powder, banana, and spinach</li>");
		pw.println("</ul>");
		pw.println("<p>Lunch:</p>");
		pw.println("<ul>");
		pw.println("  <li>Chicken or tuna salad sandwich on whole-wheat bread with avocado and cheese</li>");
		pw.println("  <li>Lentil soup with whole-wheat bread and hummus</li>");
		pw.println("  <li>Quinoa bowl with roasted vegetables, grilled chicken, and tahini dressing</li>");
		pw.println("</ul>");
		pw.println("<p>Dinner:</p>");
		pw.println("<ul>");
		pw.println("  <li>Salmon with roasted sweet potatoes and broccoli</li>");
		pw.println("  <li>Chicken stir-fry with brown rice and vegetables</li>");
		pw.println("  <li>Vegetarian chili with whole-wheat bread and cheese</li>");
		pw.println("</ul>");
	}
	else if(BMI>=18.5&&BMI<24.9) {
		pw.println("<h2 style=\"color:green;\">Healthy</h2>");
		pw.println("<img src=\"healthy.png\" width=\"200px\" height=\"200px\"></img>");
		pw.println("<h3>Excercise recommended:</h3>");
		pw.println("<p>Strength and HIIT & Fullbody and Cardio </p>");
		pw.println("<h3>Food recommendations:</h3>");
		pw.println("<p>Breakfast:</p>");
		pw.println("<ul>");
		pw.println("  <li>Greek yogurt with berries and granola (protein, fiber, vitamins)</li>");
		pw.println("  <li>Whole-wheat toast with avocado and scrambled eggs (healthy fats, protein, complex carbohydrates)</li>");
		pw.println("  <li>Oatmeal with nuts and seeds (fiber, protein, healthy fats)</li>");
		pw.println("</ul>");
		pw.println("<p>Lunch:</p>");
		pw.println("<ul>");
		pw.println("  <li>Tuna salad sandwich on whole-wheat bread with lettuce and tomato (lean protein, complex carbohydrates, vitamins)</li>");
		pw.println("  <li>Lentil soup with a side salad (protein, fiber, vitamins)</li>");
		pw.println("  <li>Chicken breast with roasted vegetables and brown rice (lean protein, complex carbohydrates, vitamins)</li>");
		pw.println("</ul>");
		pw.println("<p>Dinner:</p>");
		pw.println("<ul>");
		pw.println("  <li>Salmon with roasted Brussels sprouts and quinoa (healthy fats, protein, fiber, vitamins)</li>");
		pw.println("  <li>Turkey chili with whole-wheat bread (protein, fiber, vitamins)</li>");
		pw.println("  <li>Tofu stir-fry with vegetables and brown rice (plant-based protein, complex carbohydrates, vitamins)</li>");
		pw.println("</ul>");

	}
	else if(BMI>=25.0&&BMI<29.9) {
		pw.println("<h2 style=\"color:orange;\">Overweight</h2>");
		pw.println("<img src=\"overweight.png\" width=\"200px\" height=\"200px\"></img>");
		pw.println("<h3>Excercise recommended:</h3>");
		pw.println("<p>Focus on Cardio and Strength & Low-Impact Cardio & Core </p>");
		pw.println("<h3>Food recommendations:</h3>");
		pw.println("<p>Breakfast:</p>");
		pw.println("<ul>");
		pw.println("  <li>Greek yogurt with berries and granola</li>");
		pw.println("  <li>Whole-wheat toast with avocado and scrambled eggs</li>");
		pw.println("  <li>Oatmeal with nuts and seeds</li>");
		pw.println("</ul>");
		pw.println("<p>Lunch:</p>");
		pw.println("<ul>");
		pw.println("  <li>Tuna salad sandwich on whole-wheat bread with lettuce and tomato</li>");
		pw.println("  <li>Lentil soup with a side salad</li>");
		pw.println("  <li>Chicken breast with roasted vegetables and brown rice</li>");
		pw.println("</ul>");
		pw.println("<p>Dinner:</p>");
		pw.println("<ul>");
		pw.println("  <li>Salmon with roasted Brussels sprouts and quinoa</li>");
		pw.println("  <li>Turkey chili with whole-wheat bread</li>");
		pw.println("  <li>Tofu stir-fry with vegetables and brown rice</li>");
		pw.println("</ul>");

	}
	else if(BMI>=30) {
		pw.println("<h2 style=\"color:red;\">Obsese</h2>");
		pw.println("<img src=\"obese.png\" width=\"200px\" height=\"200px\"></img>");
		pw.println("<h3>Excercise recommended:</h3>");
		pw.println("<p>Low-Impact Cardio & Strength Training</p>");
		pw.println("<h3>Food recommendations:</h3>");
		pw.println("<p>Breakfast:</p>");
		pw.println("<ul>");
		pw.println("  <li>Greek yogurt with berries (½ cup yogurt, ¼ cup berries)</li>");
		pw.println("  <li>Whole-wheat toast with ½ avocado and 1 scrambled egg</li>");
		pw.println("  <li>Oatmeal with ¼ cup nuts and seeds</li>");
		pw.println("</ul>");
		pw.println("<p>Lunch:</p>");
		pw.println("<ul>");
		pw.println("  <li>Tuna salad sandwich on whole-wheat bread with lettuce and tomato (half a sandwich)</li>");
		pw.println("  <li>Lentil soup (smaller portion) with a side salad</li>");
		pw.println("  <li>Grilled chicken breast (3 oz), roasted vegetables (1 cup), brown rice (½ cup)</li>");
		pw.println("</ul>");
		pw.println("<p>Dinner:</p>");
		pw.println("<ul>");
		pw.println("  <li>Baked salmon (4 oz), roasted Brussels sprouts (1 cup), quinoa (½ cup)</li>");
		pw.println("  <li>Turkey chili (1 cup), whole-wheat bread (1 slice)</li>");
		pw.println("  <li>Tofu stir-fry with vegetables (1 cup), brown rice (½ cup)</li>");
		pw.println("</ul>");
	}
	pw.println("<form action=\"end\" method=\"get\">");
	pw.println("<input type=\"submit\" value=\"EXIT\" style=\"background-color:red;color:white;padding:5px\"></input>");
	pw.println("</form>");
	pw.println("</body></html>");
	}
}