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
    
    public void sortByIdade(){
        System.out.println("SORT POR IDADE \n");
        for(int i = 0; i<10;i++){
            for(int j = i+1; j< 10;j++){
                if(this.pessoas[i].idade > this.pessoas[j].idade){
                    Aluno temp = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = temp;
                }
            }
        }
        printEstudantes();
    }
    
    public void sortByNome(){
        System.out.println("SORT POR NOME \n");
        for(int i = 0; i<10;i++){
            for(int j = i+1; j< 10;j++){
                if(this.pessoas[i].nome.compareToIgnoreCase(this.pessoas[j].nome) > 0){
                    Aluno temp = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = temp;
                }
            }
        }
        printEstudantes();
    }
    
    public void printEstudantes(){
        for(int i = 0; i<10; i++){
            System.out.println(this.pessoas[i].nome + ", " + this.pessoas[i].idade);
        }
    }
}
