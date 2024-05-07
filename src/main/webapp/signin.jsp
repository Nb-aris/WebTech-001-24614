<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign In</title>
</head>
<body>
<div class="signin-container">
    <form action="SignIn_Servlet" method="post">
        <label>Email</label><br>
        <input type="text" name="email" required><br>
        <label>Password</label><br>
        <input type="password" name="password" required><br>
        <input type="submit" value="LogIn">
    </form>
</div>

</body>
</html>
