<%-- 
    Document   : page3
    Created on : 7 de nov. de 2022, 22:57:55
    Author     : naira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pagina 3</title>
    </head>
    <body>
       <h1 class='h1'>Pagina 3</h1>
        <%@include file = "WEB-INF/jspf/header.jspf" %>
        <div class="fundo">
        <p class='p'>Orgulho de ser fatecana </p>
        <center><img src="imagem/corpo-positivo.png" alt=""/></center>
        <%@include file="WEB-INF/jspf/footer.jspf" %>
        </div>
    </body>
</html>
<style>
.fundo{background-color:SteelBlue;
      max-width:100rem;} 
 .h1{color: DarkOrchid;
    font-family: Tahoma;}      
 .p{color:white;
    font-size: larger;} 
</style>