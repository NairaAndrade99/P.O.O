/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tauan
 */
@WebServlet(name = "NairaRandomSevlet", urlPatterns = {"/random.html"})
public class NairaRandomSevlet extends HttpServlet {

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
            out.println("<title>Gerar numero aleatorio</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3><a href='index.html'>voltar</a></h3>");
            
            out.println("<center><form>");
            out.println("<center><table border='3' >");
            out.println("<thread>");
           
            out.println("<h2>Informe um valor: <h/2>");
            out.println("<center><input type='number' name=\"esco\"> </input></center>"); 
             
            out.println("<tr>"); 
            out.println("<center><th>Numero</th></center>");
            out.println("<center><th>Escolha</th></center>");
            out.println("</tr>");                        
            out.println("</thread>");         
            out.println("<tbody>");       
            out.println("</tr>");
            
            out.println("<center><form action= 'random.html'><button type ='submit'>Gerar</button></form>");
            out.println("</form></center>");
             
               int esco = 0; 
              String escolha = request.getParameter("esco");
            esco = Integer.parseInt(escolha);
            out.println("<h2>"+esco+"</h2>"); 
                   Random gerador = new Random();
                      
                for (int i = 1; i < esco;i++){  
           
            out.println("<center><td>"+i+"</td></center>");         
            out.println("<center><td id ='ge'>"+gerador.nextInt(100)+"</td></center>");
            
            out.println("</tr>");
            out.println("</tbody>");
             } 
            
                    
            out.println("</table></center>");
          
                   
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
