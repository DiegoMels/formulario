/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alumno
 */
public class calculo {
    
    private Double num1, num2, num3;
    private Double resultado;
    
    // NUMERO 1
    
    public void setNum1(Double num1) {
        this.num1 = num1;
    }
    
    // NUMERO 2

    public void setNum2(Double num2) {
        this.num2 = num2;
    }
    
    // NUMERO 3

    public void setNum3(Double num3) {
        this.num3 = num3;
    }
    
    // RESULTADO
    
    public Double getResultado() {
        return resultado;
    }
  
   
    
    public void suma(){
       
        resultado = num1 + num2 + num3;
        
    }
    
    public void resta(){
        
        resultado = num1 - num2 - num3;
        
    }
    
    public void multi(){
        
        resultado = num1 * num2 * num3;
        
    }
    
    public void div(){
        
        resultado = num1 / num2 / num3;
            
    }
    
}
