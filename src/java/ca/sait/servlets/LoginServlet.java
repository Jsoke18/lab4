package ca.sait.Servlets;

import ca.sait.services.AccountService;
import ca.servlets.models.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author huyth
 */
@WebServlet(name="LoginServlet", urlPatterns={"/login"})
public class LoginServlet extends HttpServlet {
   
 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
                this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                
                AccountService account = new AccountService();
                User user = account.login(username, password);
            
                
                if(user != null){
                    request.getSession().setAttribute("username", username);
                    
                    response.sendRedirect("home");
                    return;
                } else {
                    String message = "Username or password is invalid";
                    request.setAttribute("message", message);
                }
                this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
    


}
