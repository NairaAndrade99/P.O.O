<%-- 
    Document   : index
    Created on : 13 de nov. de 2022, 00:16:05
    Author     : naira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculando Juros</title>
        
    </head>
    
    <body class="efeito">
        
        
        <%@include file="WEB-INF/menu/links.jspf" %>
         

     
        
      </body> 
    
</html>
<style> 
    
     @Keyframes animacao{
               0%{background-position: 0% 50%;}
               50% {background-position:100% 50%;}
               100% {background-position:%0 50%; }}
 
     *{
        padding: 0;
        margin: 0;
        box-sizing: border-box;           
                   
    }           
    .efeito{
     display: flex;
     align-items: center;
     justify-content: center;
     height: 100vh;
     width: 100vh;
    
     
     background: linear-gradient(45deg ,#94B49F ,#FCF8E8,#ECB390,#CEE5D0);
     background-size: 300% 300%;
     animation: animacao 15s ease ;
 }
 
</style> 