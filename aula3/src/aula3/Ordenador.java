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
public abstract class Ordenador {
    
    public abstract boolean compara(Aluno a1, Aluno a2);
    
    public void ordena(Agenda agenda){
        for(int i = 0; i<10;i++){
            for(int j = i+1; j< 10;j++){
                if(compara(agenda.pessoas[i], agenda.pessoas[j])){
                    Aluno temp = agenda.pessoas[j];
                    agenda.pessoas[j] = agenda.pessoas[i];
                    agenda.pessoas[i] = temp;
                }
            }
        }
    }
}
