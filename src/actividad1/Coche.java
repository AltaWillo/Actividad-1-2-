/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

/**
 *
 * @author Alumno 
 */
public abstract class Coche {
    
    int color=0;
    int gasolina=0;
    
    Coche(int gasolina, int color){
        this.gasolina=gasolina;
        this.color=color;
    }
    
    public abstract void acelerar();
    
    public abstract void frenar();
    
    public abstract void arrancar();
    
}
