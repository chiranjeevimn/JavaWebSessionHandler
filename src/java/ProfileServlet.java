import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ProfileServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
try {
request.getRequestDispatcher("Link.html").include(request,response);
HttpSession sess2=request.getSession(false);
if(sess2!=null)
{
String name=(String)sess2.getAttribute("name");
out.println("Hello,"+name+" <br/>Welcome to Short-Profile \n");
request.getRequestDispatcher("Profilepage.html").include(request, response);
}
else
{
out.println("please login first");
request.getRequestDispatcher("index.html").include(request, response);
}
} finally {
out.close();
}
}
}