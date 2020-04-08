import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
    urlPatterns = { "/LoginServlet" },
    initParams = {
            @WebInitParam( name="usr", value = "user"),
            @WebInitParam( name="pwd",value = "342")
    })
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("Hello");
        String userName=req.getParameter("name");
        String userPassword=req.getParameter("pwd");
        String user=getServletConfig().getInitParameter("usr");
        String pwd=getServletConfig().getInitParameter("pwd");
        if(userName.equals(user) && userPassword.equals(pwd))
            req.getRequestDispatcher("jsp/LoginSuccessPage.jsp").forward(req,resp);
        else
            req.getRequestDispatcher("jsp/LoginPage.jsp").include(req,resp);
        pw.close();
    }
}
