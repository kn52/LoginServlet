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
            @WebInitParam( name="usr", value = "Asd"),
            @WebInitParam( name="pwd",value = "Hn@123456")
    })
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();

        String userName=req.getParameter("name");
        String userPassword=req.getParameter("pwd");
        UserValidation userValidation=new UserValidation();

        String user=getServletConfig().getInitParameter("usr");
        String pwd=getServletConfig().getInitParameter("password");


        if(userValidation.validateUserName(userName) && userValidation.validateUserPassword(userPassword)){
            if(userName.equals(user) && userPassword.equals(pwd)){
                req.setAttribute("name",userName);
                req.getRequestDispatcher("jsp/LoginSuccessPage.jsp").forward(req,resp);
            }
            else {
                req.setAttribute("message","Invalid username or password or Register first...");
                req.getRequestDispatcher("jsp/LoginErrorPage.jsp").forward(req,resp);
            }
        }
        else{
            req.setAttribute("message","Enter valid input...");
            req.getRequestDispatcher("jsp/LoginErrorPage.jsp").forward(req,resp);
        }
        pw.close();
    }
}
