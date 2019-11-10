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
        
        <form:form action="processForm" modelAttribute="student">
            
            First name: <form:input path="firstName" />
            
            <br><br>
            
            Last Name*: <form:input path="lastName" />
            <form:errors path="lastName" cssClass="error" />
            
            <br><br>
            
            Country:
            <form:select path="country">
                <form:options items="${counties}" />

            </form:select>
            
            <br><br>
            
            Favorite language:
            <form:radiobuttons path="favoriteLanguage" items="${languages}" />
            
            <br><br>
            
            Operating systems:
            <form:checkbox path="operatingSystems" value="Linux" label="Linux" />
            <form:checkbox path="operatingSystems" value="Mac OS" label="Mac OS" />
            <form:checkbox path="operatingSystems" value="MS Windows" label="MS Windows" />
                        
            <br><br>
            <input type="submit" value="Submit" />
            
        </form:form>
        
    </body>
</html>
