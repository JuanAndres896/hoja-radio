
import java.util.Arrays;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 13 de Julio del 2016
 * Descripción: Esta es la clase que implenta la interfaz, la cual es el objeto que se va a utilizar para darle vida al Radio. 
 * Esta es una de las clases que se van a cambiar entre las hojas de trabajo. Debería ser muy similar a las otras. 
 */
public class RadioCarro implements Radio{
    
    /**
     * Atributo para manejar el estado de encendido/apagado de la radio (true/false respectivamente)
     */
    private boolean encendido;
    
    /**
        * Atributo para manejar la elección de frecuencia am/fm (false/true respectivamente)
     */
    private boolean frecuencia;
    
    /** 
     * Atributo para guardar la elección de la estación 
     */
    private double estacion;
    
    private double[] emisoras;
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - - - S E T T E R S - - - - - -- - - - - - - - - -
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    public RadioCarro(){
        emisoras=new double[12];
        Arrays.fill(emisoras,530);
        frecuencia=true;
        
        
    }

    /**
     * Método para para manejar el estado de encendido/apagado de la radio (true/false respectivamente)
     * @param estado boolean para indicar el estado de encendido/apagado de la radio
     */
    @Override
    public void setEncendido(boolean estado) {
        this.encendido = estado;
    }
    
    /**
     * Método para manejar la elección de frecuencia am/fm (false/true respectivamente) 
     * @param frecuencia
     */
    @Override
    public void setFrecuencia(boolean frecuencia){
        this.frecuencia = frecuencia;
    }
    
    /**
     * Método para ir cambiando las estaciones
     * @param emisora
     */
    @Override
    public void setEmisora(double emisora){
        this.estacion = emisora;
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - O P E R A T I O N S - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    /**
     * Método para guardar una emisora favorita
     * @param registro
     * @param emisora
     */
    @Override
    public void saveEmisora(int registro, double emisora){
        registro = registro;
        this.emisoras[registro] = emisora;
    }
    
    /**
     * Método para seleccionar una de las emisoras puesta en el botón
     * @param registro
     * @return double con la emisora a seleccionar 
     */
    @Override
    public double selectEmisora(int registro){
        registro = registro;
        double emisora;
        emisora=this.emisoras[registro];
        return emisora;
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // - - - - - - - - - - -  - G E T T E R S - - - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
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
    public double getEmisora(){
        return estacion;
    }   
    
}
