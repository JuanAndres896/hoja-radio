/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 13 de Julio del 2016
 * Descripción: En esta clase se realizan las pruebas unitarias
 */

import java.util.Arrays;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanAndrés
 */
public class RadioCarroTest {
    
    public RadioCarroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setEncendido method, of class RadioCarro.
     */
    @Test
    public void testSetEncendido() {
        System.out.println("setEncendido");
        boolean estado = false;
        RadioCarro instance = new RadioCarro();
        instance.setEncendido(estado);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setFrecuencia method, of class RadioCarro.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        boolean frec = false;
        RadioCarro instance = new RadioCarro();
        instance.setFrecuencia(frec);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEstacion method, of class RadioCarro.
     */
    @Test
    public void testSetEmisora() {
        System.out.println("setEstacion");
        double est = 530;
        RadioCarro instance = new RadioCarro();
        instance.setEmisora(est);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of guardarEmisora method, of class RadioCarro.
     */
    @Test
    public void testSaveEmisora() {
        System.out.println("guardarEmisora");
        int bt =1 ;
        double emi = 90.5;
        RadioCarro instance = new RadioCarro();
        instance.saveEmisora(bt, emi);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of seleccionarEmisora method, of class RadioCarro.
     */
    @Test
    public void testSeleccionarEmisora() {
        System.out.println("seleccionarEmisora");
        int bt = 1;
        RadioCarro instance = new RadioCarro();
        double expResult = 530;
        double result = instance.selectEmisora(bt);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getEncendido method, of class RadioCarro.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        RadioCarro instance = new RadioCarro();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getFrecuencia method, of class RadioCarro.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        RadioCarro instance = new RadioCarro();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEstacion method, of class RadioCarro.
     * 
     * Esta prueba tenia fallos... no identifica si un array es igual al otro
     */
   @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        RadioCarro instance = new RadioCarro();
        double expResult = 2.0;
        double result = instance.getEmisora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    private void assertArrayEquals(double[] expResult, double[] result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
