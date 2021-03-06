/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.mestrado.classes;

import java.util.Arrays;
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
    public void encontrarNumerosMenores() {
        ConsultarVetor consultarVetor = new ConsultarVetor(new Validador());
        List<Double> retorno = consultarVetor.buscarNumeroMenores(numeros, 4D);
        assertEquals(Arrays.toString(new double[]{1, 2}),  Arrays.toString(retorno.toArray()));
    
    }
    
    @Test
    public void encontrarNumerosMaiores() {
        ConsultarVetor consultarVetor = new ConsultarVetor(new Validador());
        List<Double> retorno = consultarVetor.buscarNumeroMaiores(numeros, 4D);
        assertEquals(Arrays.toString(new double[]{5, 6}),  Arrays.toString(retorno.toArray()));
    
    }
}
