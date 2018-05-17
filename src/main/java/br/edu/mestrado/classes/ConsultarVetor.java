/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.mestrado.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ed_ve
 */
public class ConsultarVetor {
    
    private ValidadorInt validador;

    public ConsultarVetor(ValidadorInt validador) {
        this.validador = validador;
    }       

    public List<Double> buscarNumeroMenores(double[] numeros, double n) {
        List<Double> lstNumerosMenores = new ArrayList<>();
        if (validador.validar(numeros)){
            for (double num : numeros){
                if (num < n){
                    lstNumerosMenores.add(num);
                }
            }
        }
        return lstNumerosMenores;
    }
    
     public List<Double> buscarNumeroMaiores(double[] numeros, double n) {
        List<Double> lstNumerosMenores = new ArrayList<>();
        if (validador.validar(numeros)){
            for (double num : numeros){
                if (num > n){
                    lstNumerosMenores.add(num);
                }
            }
        }
        return lstNumerosMenores;
    }
    
}
