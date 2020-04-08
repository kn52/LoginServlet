<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../css/loginStyleSheet.css">
    <title>Login Success</title>
</head>
<body style="background-color: aquamarine">
<div>
    <div>
        <form action="jsp/LoginPage.jsp" method="post">
            <h2 style="color: blue;"><%=request.getAttribute("name")%>&nbsp;You login Successfully....</h2>
            <input type="submit" value="Logout">
        </form>
    </div>
</div>
</body>
</html>
