<%-- 
    Document   : page1
    Created on : 7 de nov. de 2022, 22:57:37
    Author     : naira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina 1</title>
    </head>
    <body>
        
          <h1 class='h1'>Pagina 1</h1>
        <%@include file = "WEB-INF/jspf/header.jspf" %>
          <div class="fundo">
          <p class='p'>Fatecano</p>
          <center>
            <img src="imagem/mensagem.png" style="max-width:35rem ;" alt=""/>
          </center>
        <%@include file="WEB-INF/jspf/footer.jspf" %>
        </div>
    </body>    
  </html>

 <style>  
   
   .fundo{background-color:MediumSlateBlue;
          max-width:100rem;} 
   .h1{color: DarkOrchid;
          font-family: Tahoma;} 
   .p{color:white;
          font-size: larger;}

</style>