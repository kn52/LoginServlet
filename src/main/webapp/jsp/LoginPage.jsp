<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../css/loginStyleSheet.css">
    <title>Login Page</title>
</head>
<body>
    <div class="login">
        <div class="innerDiv">
            <form action="../LoginServlet"  method="get">
                <table>
                    <tr><td class="alignCentre header colspan3" color="blue">Login</td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td class="label">Username</td><td></td><td></td></tr>
                    <tr><td class="colspan3"><input type="text" name="name" required/></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td class="label">Password</td><td></td><td></td></tr>
                    <tr><td class="colspan3"><input type="password" name="pwd" required/></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td class="alignCentre colspan3"><input type="submit" value="Login"></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td class="alignRight colspan3" color="red" style="text-decoration: underline;">Not Registered:<a href="RegistrationPage.jsp">Register</a></td></tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>
