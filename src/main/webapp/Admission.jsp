<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admission</title>
</head>
<body>
<div class="signup-container">
    <form action="AdmisionServlet" method="Post">
        <label for="">Full name</label><br>
        <input type="text" name="name"><br>
        <label id="Genders">Gender</label><br>
        <select id="gender" name="gender" required><br>
            <option value="">Select Gender</option>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select><br>
        <label>Birth date</label><br>
        <input type="date" name="bd" required><br>
        <label for="">email</label><br>
        <input type="text" name="email"><br>
        <label>Course to study</label><br>
        <select name="course" id="" required>
            <option value="">Select Course</option>
            <option value="male">Big data</option>
            <option value="female">AI</option>
            <option value="other">Data science</option>
        </select><br>
        <label >Passport Picture (JPG/PNG):</label><br>
        <input type="file" name="passportPicture" accept=".jpg,.jpeg,.png"><br>
        <label >Other Document (PDF):</label><br>
        <input type="file" name="otherDocument" accept=".pdf"><br>
        <input type="submit" value="Submit">
    </form>
    </div>
</body>
</html>
