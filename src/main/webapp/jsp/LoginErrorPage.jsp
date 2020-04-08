<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Error</title>
</head>
<body style="background-color: aquamarine;">
<div>
    <div>
        <form action="jsp/LoginPage.jsp" method="post">
            <h2 style="color: blue;"><%=request.getAttribute("message")%></h2>
            <input type="submit" value="Back">
        </form>
    </div>
</div>
</body>
</html>
