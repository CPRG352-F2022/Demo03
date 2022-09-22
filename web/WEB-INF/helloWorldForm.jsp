<%-- 
    Document   : helloWorldForm
    Created on : Sep 21, 2022, 8:43:50 AM
    Author     : dyadlows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World Form</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="POST" action="hello">
            <div>
                <label>First Name:</label>
                <input type="text" name="first_name" value="${firstName}">
            </div>
            <div>
                <label>Last Name:</label>
                <input type="text" name="last_name" value="${lastName}">
            </div>
            <div>
                <br>
                <input type="submit" value="Say Hello!">
            </div>
        </form>
        <p>${message}</p>
    </body>
</html>
