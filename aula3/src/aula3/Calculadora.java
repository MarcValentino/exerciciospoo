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
public class Calculadora {
    public static double memoria;
    
    public static void run(Scanner teclado){
        int opcao = 0;
        while(opcao !=6){
            
            System.out.println("Estado da memória: " + memoria);
            System.out.println("Opções:");
            System.out.println("(1) Somar");
            System.out.println("(2) Subtrair");
            System.out.println("(3) Multiplicar");
            System.out.println("(4) Dividir");
            System.out.println("(5) Limpar memória");
            System.out.println("(6) Sair");
            opcao = teclado.nextInt();
            
            switch(opcao){
                case 1:
                    memoria = soma(memoria, teclado.nextDouble());
                    break;
                case 2:
                    memoria = sub(memoria, teclado.nextDouble());
                    break;
                case 3:
                    memoria = mult(memoria, teclado.nextDouble());
                    break;
                case 4:
                    memoria = div(memoria, teclado.nextDouble());
                    break;
                case 5:
                    memoria = reset();
            }
            
        }
    }

    private static double soma(double memoria, double nextDouble) {
        return memoria + nextDouble;
    }

    private static double sub(double memoria, double nextDouble) {
        return memoria - nextDouble;
    }

    private static double mult(double memoria, double nextDouble) {
        return memoria * nextDouble;
    }

    private static double div(double memoria, double nextDouble) {
        return memoria / nextDouble;
    }

    private static double reset() {
        return 0;
    }
}
