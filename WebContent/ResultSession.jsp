<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>

<head>
<title> PREPROVA INTERCORSO</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
<h2>Salve!</h2>

    <%
        String nome= (String) request.getAttribute("nome");
        String cognome=(String) request.getAttribute("cognome");
        String ruolo=(String) request.getAttribute("ruolo");
        boolean nuovo = (boolean) request.getAttribute("nuovo");
    %>

    <h1>Eccoti!</h1>
    <%
        if(nuovo == true)
        {
    %>
        <p> Benvenuto <%= nome %> <%= cognome %> , il tuo ruolo è: <%= ruolo %> </p>
    <%
        }
        else
        {
        %>
        <p> Bentornato <%= nome %> <%= cognome %> , tu ricopri il ruolo di <%= ruolo %> </p>
        <%
        }
        %>
</body>
</html>