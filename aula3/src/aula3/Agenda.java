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
public class Agenda {
    Aluno[] pessoas = new Aluno[10];
    
    Agenda(Aluno[] gentes){
        this.pessoas = gentes;
        
    }
    
    public void printEstudantes(){
        for(int i = 0; i<10; i++){
            System.out.println(this.pessoas[i].nome + ", " + this.pessoas[i].idade);
        }
    }
}
