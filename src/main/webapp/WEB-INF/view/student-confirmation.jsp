<%-- 
    Document   : student-confirmation
    Created on : 09.11.2019, 17:40:21
    Author     : smallad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Confirmation</title>
    </head>
    <body>
        The student is confirmed: ${student.firstName} ${student.lastName}
        
        <br><br>
        Country: ${student.country}
    </body>
</html>
