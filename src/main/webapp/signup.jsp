<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
</head>
<body>
<div class="signup-container">
    <form action="SignUp_Servlet" method="post">
        <label>Full name</label><br>
        <input type="text" name="name" required><br>
        <label>Email</label><br>
        <input type="text" name="email" required><br>
        <label>Create password</label><br>
        <input type="password" name="password" required><br>
        <input type="submit" value="SignUp">
    </form>
</div>
</body>
</html>
