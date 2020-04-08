<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <div style="margin-left: 500px; margin-top: 170px; width:400px; height:300px; border-radius:20px; background-color: aquamarine; border: 1px solid aqua;">
        <div style="margin-left: 110px; margin-top: 50px; width: 180px; height: 200px;">
            <form action="../LoginServlet"  method="get">
                <table>
                    <tr><td align ="center" style="font-size: 40px;" colspan="3" >Login</td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td style="font-size: 15px; color: blue;">Username</td><td></td><td></td></tr>
                    <tr><td colspan="3"><input type="text" name="name" required/></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td style="font-size: 15px; color: blue;">Password</td><td></td><td></td></tr>
                    <tr><td colspan="3"><input type="password" name="pwd" required/></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td align="center" colspan="3"><input type="submit" value="Login"></td></tr>
                    <tr><td></td><td></td><td></td></tr>
                    <tr><td align="right" colspan="3" style="font-size: 15px; color: blue;"><a href="">Register</a></td></tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>
