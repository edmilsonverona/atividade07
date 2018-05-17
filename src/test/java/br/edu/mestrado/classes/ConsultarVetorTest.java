/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.mestrado.classes;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ed_ve
 */
public class ConsultarVetorTest {
    
    public ConsultarVetorTest() {
    }
    
    private final double[] numeros = {1, 5, 6, 2};

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void encontrarNumeroMenores() {
        ConsultarVetor consultarVetor = new ConsultarVetor();
        List<Double> retorno = consultarVetor.buscarNumeroMenores(numeros, 4D);
        assertEquals(new int[]{1, 2}, retorno.toArray());
    
    }
}
