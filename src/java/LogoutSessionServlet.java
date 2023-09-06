
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LogoutSessionServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter()) {
request.getRequestDispatcher("Link.html").include(request, response);
HttpSession sess = request.getSession();
sess.invalidate();
out.println("You are successfully logged out");
}
finally{
    out.close();
}
}
}