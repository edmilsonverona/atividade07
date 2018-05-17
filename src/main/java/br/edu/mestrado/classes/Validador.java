/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.mestrado.classes;

/**
 *
 * @author ed_ve
 */
public class Validador implements ValidadorInt{

    @Override
    public boolean validar(double[] numeros) {
        if (numeros == null || numeros.length == 0){
            return false;
        }
        return true;
    }
    
}
