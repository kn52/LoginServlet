<html>
<head>
    <title>Login Success</title>
</head>
<body style="background-color: aquamarine;">
<div>
    <div>
        <form action="jsp/LoginPage.jsp" method="post">
            <h2 style="color: blue;"><%=request.getAttribute("name")%>Login Successfully....</h2>
            <input type="submit" value="Logout">
        </form>
    </div>
</div>
</body>
</html>
