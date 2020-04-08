import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("Hello");
        String name=req.getParameter("name");
        String password=req.getParameter("pwd");
        if(name.equals("user") && password.equals("342"))
            resp.sendRedirect("jsp/LoginSuccessPage.jsp");
        else
            resp.sendRedirect("jsp/LoginPage.jsp");
        pw.close();
    }
}
