/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author MVale
 */
public abstract class Animal {
    public String nome;
    
    Animal(String nm){
        this.nome = nm;
    }
    public abstract void fala();
}
