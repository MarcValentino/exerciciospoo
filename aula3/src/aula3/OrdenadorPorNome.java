/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author MVale
 */


public class OrdenadorPorNome extends Ordenador{
    
    OrdenadorPorNome(){
        super();
    }
    
    @Override
    public boolean compara(Aluno a1, Aluno a2){
        return (a1.nome.compareToIgnoreCase(a2.nome) > 0);
    }
}

