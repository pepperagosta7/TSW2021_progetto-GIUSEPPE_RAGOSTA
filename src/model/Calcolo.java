package model;

public class Calcolo {
  
  public Calcolo(double b, double a) {
    
    base=b;
    altezza=a;
  }
  
  public double getArea() {
    return base*altezza;
  }
  
  
private double base;
private double altezza;
}