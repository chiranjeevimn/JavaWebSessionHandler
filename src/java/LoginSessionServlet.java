import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginSessionServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
String s1 = request.getParameter("uname");
String s2 = request.getParameter("pwd");
try (PrintWriter out = response.getWriter()) {
if(s1.equals("Chiru") && s2.equals("Chiru12"))
{
out.println("Welcome :"+s1);
HttpSession ss1 = request.getSession();
ss1.setAttribute("\n name", s1);
request.getRequestDispatcher("Link.html").include(request, response);
}
else
{
out.println("Sorry, username or password error!");
request.getRequestDispatcher("index.html").include(request, response);
}
}
finally{
    out.close();
}
}
}