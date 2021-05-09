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
    Cookie[] cookies =request.getCookies();
    String nome=null;
    String cognome=null;
    String ruolo=null;
    String nome2=(String)request.getAttribute(nome);
    String cognome2=(String)request.getAttribute(cognome);
    String ruolo2= (String)request.getAttribute(ruolo);
    out.println(nome2 + " " + cognome2 + " " + ruolo2 );

    /*if (cookies !=null){
        for (int i=0; i<cookies.length; i++){
            Cookie cookie= cookies[i];
            if(cookie.getName().equals("nome")){
                nome=cookie.getValue();
            }
            if(cookie.getName().equals("cognome")){
                cognome=cookie.getValue();
            }
            if(cookie.getName().equals("ruolo")){
                ruolo=cookie.getValue();
            }
        }
        out.println("<h2> Bentornato " + nome + " " +  cognome + " il tuo ruolo è " + ruolo + " <h2>");
    }

    else {
        out.println("<h2> Benvenuto  " + nome + " " +  cognome + " è la prima volta che sei su questo sito. Il tuo ruolo è " + ruolo + " <h2>");
    }*/
    %>




</body>
</html>