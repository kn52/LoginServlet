import javax.servlet.RequestDispatcher;
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

        String userName=req.getParameter("name");
        String userPassword=req.getParameter("pwd");
        UserValidation userValidation=new UserValidation();

        if(userValidation.validateUserName(userName) && userValidation.validateUserPassword(userPassword)){
            req.setAttribute("name",userName);
            req.getRequestDispatcher("jsp/LoginSuccessPage.jsp").forward(req,resp);
        }
        else{
            pw.println("Wrong useranme or password");
            resp.sendRedirect("jsp/LoginPage.jsp");
        }
        pw.close();
    }
}
