package control;

import model.Calcolo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calcolatore")
public class Calcolatore extends HttpServlet {
  private static final long serialVersionUID = 1L;
   
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    
    
    String b=request.getParameter("base");
    double base = Double.parseDouble(b);
    
    String a=request.getParameter("altezza");
    double altezza = Double.parseDouble(a);
    
    if (base<0 || altezza<0)out.print("sei un alieno");
    
    Calcolo c = new Calcolo(base,altezza);
    
    double area=c.getArea();
    
    out.print("l'area calcolata è:" + area + "<br>");
    
  }

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
    doGet(request, response);
  }

}