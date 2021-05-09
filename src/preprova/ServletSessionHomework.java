package preprova;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletSessionHomework")
public class ServletSessionHomework extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String nome=request.getParameter("nome");
        String cognome=request.getParameter("cognome");
        String ruolo=request.getParameter("ruolo");
        boolean nuovo = true;

        Persona p = new Persona(nome,cognome,ruolo);

        HttpSession session = request.getSession(true);
        
        if(session != null)
        {
            Enumeration e = session.getAttributeNames();
           while(e.hasMoreElements())
           {
               String nome2 = (String) e.nextElement();                    
               Persona tmp = (Persona) session.getAttribute(nome2);        
                if(p.equals(tmp)) nuovo = false;                            
           }
        }
        request.setAttribute("nome", nome);
        request.setAttribute("cognome", cognome);
        request.setAttribute("ruolo", ruolo);
        request.setAttribute("nuovo", nuovo);
     
        RequestDispatcher x = getServletContext().getRequestDispatcher("/ResultSession.jsp");
        
        x.forward(request, response);
        if(nuovo == true) session.setAttribute(nome + cognome, p);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        doGet(request, response);
    }
}