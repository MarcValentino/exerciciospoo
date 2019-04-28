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
public class Gato extends Animal{
    
    Gato(String nome){
        super(nome);
    }
    
    @Override
    public void fala(){
        System.out.print("Miau\n");
    }
}
