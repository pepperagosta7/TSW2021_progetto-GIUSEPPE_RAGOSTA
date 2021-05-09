package preprova;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletHomework")
public class ServletCookiesHomework extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String nome=request.getParameter("nome");
        String cognome=request.getParameter("cognome");
        String ruolo=request.getParameter("ruolo");
        System.out.println(nome + "" + cognome + "" + ruolo);

        Cookie c = new Cookie("nome", nome);
        c.setSecure(true);
        c.setMaxAge(3600);
        c.setPath("/");
        response.addCookie(c);

        Cookie c1 = new Cookie("cognome", cognome);
        c.setSecure(true);
        c.setMaxAge(3600);
        c.setPath("/");
        response.addCookie(c1);

        Cookie c2 = new Cookie("ruolo", ruolo);
        c.setSecure(true);
        c.setMaxAge(3600);
        c.setPath("/");
        response.addCookie(c2);
        request.setAttribute("nome", nome);
        request.setAttribute("cognome", cognome);
        request.setAttribute("ruolo", ruolo);

                    RequestDispatcher vista= getServletContext().getRequestDispatcher("/ResultCookies.jsp");
                    vista.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

}