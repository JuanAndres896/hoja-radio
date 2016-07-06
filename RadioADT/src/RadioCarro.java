/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Morales
 */
public class RadioCarro implements Radio{
    
    /**
     * Atributo para manejar el estado de encendido/apagado de la radio (true/false respectivamente)
     */
    public boolean encendido;
    
    /**
        * Atributo para manejar la elección de frecuencia am/fm (false/true respectivamente)
     */
    public boolean frecuencia;
    
    /** 
     * Atributo para guardar la elección de la estación 
     */
    public double estacion;
    
    /**
     * Método para para manejar el estado de encendido/apagado de la radio (true/false respectivamente)
     * @param estado boolean para indicar el estado de encendido/apagado de la radio
     */
    @Override
    public void setEncendido(boolean estado){
        
    }
    
    /**
     * Método para manejar la elección de frecuencia am/fm (false/true respectivamente)
     * @param frec boolean para indicar la elección de frecuencia am/fm 
     */
    @Override
    public void setFrecuencia(boolean frec){
        
    }
    
    /**
     * Método para ir cambiando las estaciones
     * @param est double para guardar la elección de la estación
     */
    @Override
    public void setEstacion(double est){
        
    }
    
    /**
     * Método para guardar una emisora favorita
     * @param em int para alojar la emisora en un botón
     */
    @Override
    public void guardarEmisora(int em){
        
    }
    
    /**
     * Método para seleccionar una de las emisoras puesta en el botón
     * @param emi int para identificar la emisora en el botón y seleccionarla
     */
    @Override
    public void seleccionarEmisora(int emi){
        
    }
    
    /**
     * Método que devuelve el estado de encendido/apagado de la radio
     * @return encendido: boolean del estado
     */
    @Override
    public boolean getEncendido(){
        return encendido;
    }
    
    /**
     * Método que devuelve la frecuencia seleccionada
     * @return frecuencia: boolean de am/fm
     */
    @Override
    public boolean getFrecuencia(){
        return frecuencia;
    }
    
    /**
     * Método que devuelve la estación seleccionada
     * @return double de la estación que se escucha 
     */
    @Override
    public double getEstacion(){
        return estacion;
    }   
    
}
