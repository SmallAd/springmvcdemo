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
        <title>Customer Confirmation</title>
    </head>
    <body>
        The customer is confirmed: ${customer.firstName} ${customer.lastName}

        <br><br>
        
        Free passes: ${customer.freePasses}
        
        <br><br>
        
        Postal code: ${customer.postalCode}

        <br><br>

    </body>
</html>
