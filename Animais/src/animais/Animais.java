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
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal [] animais = {new Humano("Finn"), new Cachorro("Jake"),
        new Gato("Quica"), new Humano("Pedro"), new Cachorro("Cadu"), 
        new Gato("Astor"), new Humano("Douglas"), new Cachorro("Xereta"), new Gato("Pitts"), new Cachorro("Princesa")};
        
        for (Animal animal : animais) {
            System.out.print(animal.nome + " diz: ");
            animal.fala();
        }
    }
    
}
