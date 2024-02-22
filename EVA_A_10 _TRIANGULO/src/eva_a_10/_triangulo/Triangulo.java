/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_a_10._triangulo;

/**
 *
 * @author invitado
 */
public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){//constructor
        base = -1;
        altura = -1;
    }
    public void setBase(double valor){
        base = valor;
}
    public void setAltura(double valor){
        altura = valor;
}
    public double getBase(){
        return base;
}
    public double getAltura(){
        return altura;
}
    private double calcularArea(){
        return (base * altura)/2;
    
    }
    private double calcularPeri(){
       double peri;

       peri = base + altura + (Math.sqrt(Math.pow(base, 2)+(Math.pow(altura, 2))));
        // suma de los tres lados, falta el lado mayor (Hipotenusa)
        //pero = ???????????????
        return peri;
}   
    public void impimirDatos(){
    System.out.println("Base " + getBase());
    System.out.println("Altura " + getAltura());
    System.out.println("el area del triángulo es: " + calcularArea());
    System.out.println("el perimeto del triángulo es: " + calcularPeri());
  }
}
