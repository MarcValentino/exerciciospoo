/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;
import java.util.Scanner;
/**
 *
 * @author MVale
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        Aluno [] pessoas = {new Aluno("Bruno", 16), new Aluno("Zozimo", 50), 
                 new Aluno("Aldo", 23), new Aluno("Fabio", 1), new Aluno("Natalia", 80), new Aluno("Maria", 42),
                new Aluno("Carlos", 42), new Aluno("Luana", 67), new Aluno("Luana", 35), new Aluno("Orlando", 82)};
        Agenda minhaAgenda = new Agenda(pessoas);
        
        OrdenadorPorNome ordNome = new OrdenadorPorNome();
        OrdenadorPorIdade ordIdade = new OrdenadorPorIdade();
        
        minhaAgenda.printEstudantes();
        System.out.println("");
        ordIdade.ordena(minhaAgenda);
        minhaAgenda.printEstudantes();
        System.out.println("");
        ordNome.ordena(minhaAgenda);
        minhaAgenda.printEstudantes();
        //Calculadora.run(new Scanner(System.in));
        
    }
    
}
