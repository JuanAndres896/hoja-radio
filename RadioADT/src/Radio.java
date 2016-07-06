/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Morales
 */
public interface Radio {
    
    public void encendido(boolean estado);
    
    public void frecuencia(boolean frec);
    
    public void cambiarEstaciones(double est);
    
    public void guardarEmisora(int em);
    
    public void seleccionarEmisora(int emi);
        
    
    
}
