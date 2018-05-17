/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.mestrado.classes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ed_ve
 */
public class ValidadorTest {
    
    public ValidadorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void validarVetorNulo() {
        
        Validador validador = new Validador();
        assertFalse(validador.validar(null));
    }
    
    @Test
    public void validarVetorVazio() {
        
        Validador validador = new Validador();
        double[] numeros = {};
        assertFalse(validador.validar(numeros));
    }
}
