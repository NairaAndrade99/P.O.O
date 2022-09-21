/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tauan
 */
@WebServlet(name = "NairaMath.Servlet", urlPatterns = {"/math.html"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3><a href='index.html'>Voltar</a></h3>");
            out.println("<center><h1>Operação Aritmetica</h1></center>");
            
            out.println("<center><form>");
            out.println("<label for='name'>Primeiro valor</label><br> ");
            out.println("<input type='number' name=\"n1\"><br> ");
            
            out.println("<label for= 'name'>Segundo valor</label><br> ");
            out.println("<input type='number' name=\"n2\"> ");
            
            
            out.println("<center><select name=\"opcao\">");
            out.println("<option value=\"null\">Operações </option>");
            out.println("<option value= \"1\">soma</option>");
            out.println("<option value=\"2\">divisão</option>");
            out.println("<option value=\"3\">multiplicação</option>");
            out.println("<option value=\"4\">subtração</option>");
            out.println("<center></select>");
            
            out.println("<input type='submit' value='calcular' />");
            out.println("</form></center>");
            
             
             double  n1,n2;
            String num1 = request.getParameter("n1");
            n1 = Double.parseDouble(num1);
            String num2 = request.getParameter("n2");
            n2 = Double.parseDouble(num2);
            String result = request.getParameter("opcao");
       
              switch (result){
                   case"null":
                   
                 out.println("<h1>O calculo não pode ser realizado ! informe a operação</h1>");
              break;
                case"1":
                  double r = n1 + n2;
                 out.println("<h1>Resultado : "+ n1 + " + " + n2 + " = " + r + " </h1>");
              break;
              case"2":
                  r = n1 / n2;
                out.println("<h1>Resultado : " + n1 + " % " + n2 + " = " + r + "</h1>");
              break;
              case"3":
                  r = n1 * n2;
                 out.println("<h1>Resultado : " + n1 + " x " + n2 + " = " + r + "</h1>");
              break;
              case"4":
                  r = n1 - n2;
                 out.println("<h1>Resultado : " + n1 + " - " + n2 + " = " + r + "</h1>");
              break;
              
        }
           
            out.println("</body>");
            out.println("</html>");
            
        }
    }
            
                
           

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
