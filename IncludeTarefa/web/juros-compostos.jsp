<%-- 
    Document   : juros-compostos
    Created on : 13 de nov. de 2022, 00:47:19
    Author     : naira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    String errorMessage = null;
    boolean hasParameters = request.getParameter("somar") != null;
    double capital = 0,montante =0;
     int taxa =0, meses=0;

    if (hasParameters) {
        try {
             
            capital =Double.parseDouble(request.getParameter("capital"));
            meses = Integer.parseInt(request.getParameter("meses"));
            taxa = Integer.parseInt(request.getParameter("taxa"));
             
             
            // montante = capital * Math.pow ((1 + (taxa / 100)), meses);
              
             montante  = capital * (Math.pow(1.0 + taxa, meses));
            
             
        } catch (Exception ex) {
            errorMessage = "Erro ao tentar ler parâmetros";

        }
    }

%>
<html>
    <head >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juros Compostos</title>
    </head>
    <body class="fundo" >
        
        
        <%@include file="WEB-INF/menu/seta.jspf" %>
      
        
        <h1 class="titulo">Calcular o Juros Compostos</h1>
        <div>
        <% if(errorMessage!=null){%>
         
         <div style="color: red"><%= errorMessage %></div>
         
         <% }else if(hasParameters){%>
         <%}%>
        </div>
            <center> <div class="container"  >      
                    <form  action="juros-compostos.jsp" >                   
        <h3 class="text">Capital 
            <input class="put" type="number" name="capital" value="<%=capital %>"/>
        </h3>
        <h3 class="text">Taxa de juros %
        <input class="put" type="number" name="taxa" value="<%=taxa %>"/>
        </h3>
        <h3 class="text">Meses 
        <input  class="put" type="number" name="meses" value="<%=meses %>"/>
        </h3>
         <input class="buttom" type="submit"  name="somar" value="calcular"/>
            
       </forma>
                
        
       <h2 class="text">R$ <%=montante%></h2>
            </div></center> 
           
         
      
    </body>
</html>

<style>
    
 
    .fundo{
        background-color: #354259;
         background: linear-gradient(45deg ,#F3C5C5 ,#C1A3A3,#886F6F,#694E4E);
    }
    .container{
    display: flex;
    justify-content: center;
    align-items: center;
    width: 40%;
    padding: 26px;
    margin-top: 5%;
    border: 2px solid #F8F5F1;
    outline: none;
    border-radius: 70px;
    background-color: #F8F8F8;
    box-shadow: 5px 5px 5px  #F4F9F9 ;
    margin: 3%;
    }
    .text{
        font-family: "Montserrat",sans-serif;
        font-size: 2rem;
        color: #372948;
        
    }  
    .put{
    padding: 6px;
    border: 2px solid   #372948 ;
       
    outline: none;
    border-radius: 7px; 
        
    }
    .buttom{
        font-size: 1rem;
        padding: 15px;
	color:#A7BBC7;
	border: 1px solid #eee;
	border-radius: 20px;
	box-shadow: 5px 5px 5px #eee;
	text-shadow: none;
         background-color: #eee;
         font-weight: 900;
    }
    .buttom:hover{
       color:#eee;
        background-color: #886F6F; 
          
        
        
    }
    .titulo{
    font-family: "Montserrat",sans-serif;
   font-weight: 800;
   text-decoration:none;
   font-size: 3rem;
   color: #fff;
  display: flex;
    justify-content: center;
    align-items: center;
        
    }
    
</style>