<%-- 
    Document   : student-form
    Created on : 09.11.2019, 17:26:34
    Author     : smallad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Registration Form</title>
        
        <style>
            .error {color: red}
        </style>
    </head>
    <body>
        
        <form:form action="processForm" modelAttribute="customer">
            
            First name: <form:input path="firstName" />
            
            <br><br>
            
            Last Name*: <form:input path="lastName" />
            <form:errors path="lastName" cssClass="error" />
                        
            <br><br>
            <input type="submit" value="Submit" />
            
        </form:form>
        
    </body>
</html>
