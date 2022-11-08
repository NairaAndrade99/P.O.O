<%-- 
    Document   : index
    Created on : 7 de nov. de 2022, 22:57:22
    Author     : naira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >
        <center><div class="header">
        <h1 class="h1">Pagiana Inicial</h1>
        
       <%@include file="WEB-INF/jspf/header.jspf" %>
       </div></center>
      <center> 
          <div class="fundo">
        <img class="card-img"  src="imagem/a-partir-de.png" style="max-width:35rem ;" alt="Imagem do card">
        
   </div>
      </center>
    </body>
   </html>
       <style> 
       
    @Keyframes animacao{
               0%{backgraund-color:Purple;}
                30% {background-color:RebeccaPurple;}
               50% {background-color:Plum;}
                100% {background-color:yellow;} }

 .fundo{background-color:Purple;
       animation-name:animacao;
       animation-duration: 6s;
       animation-delay: 5s;
       animation-iteration-count: infinite;}
     
.h1{color: DarkOrchid;
    font-family: Tahoma;
       }
.header{background-color: White}

</style>
          

 

  


      
