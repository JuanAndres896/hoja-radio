
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
     * @param frec boolean para indicar la elección de frecuencia am/fm 
     */
    @Override
    public void setFrecuencia(boolean frec){
        this.frecuencia = frec;
    }
    
    /**
     * Método para ir cambiando las estaciones
     * @param est double para guardar la elección de la estación
     */
    @Override
    public void setEmisora(double est){
        this.estacion = est;
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - O P E R A T I O N S - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    /**
     * Método para guardar una emisora favorita
     * @param bt int para identificar el boton donde guardar
     * @param emi double para identificar a la emisora a guardar
     */
    @Override
    public void saveEmisora(int bt, double emi){
        bt = bt - 1;
        this.estacion[bt] = emi;
    }
    
    /**
     * Método para seleccionar una de las emisoras puesta en el botón
     * @param bt int para identificar la emisora en el botón y seleccionarla
     * @return double con la emisora a seleccionar 
     */
    @Override
    public double selectEmisora(int bt){
        bt = bt - 1;
        return this.estacion[bt];
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
