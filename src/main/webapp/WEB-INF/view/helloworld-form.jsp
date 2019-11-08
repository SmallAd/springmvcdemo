<%-- 
    Document   : helloworld-form
    Created on : 08.11.2019, 23:32:59
    Author     : smallad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World - Input Form</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="processFormV2" method="GET">
            
            <input type="text" name="studentName"
                   placeholder="What's your name?" />
            
            <input type="submit" />
            
        </form>
    </body>
</html>
