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
    
    public static void ordena(){
        String[] nomes = {"Bruno", "Zozimo", "Aldo", "Fabio", "Natalia",
            "Maria", "Carlos", "Luana", "Luana", "Orlando"};
        int[] idades = {16, 50, 23, 1, 80, 42, 42, 67, 35, 82};
        /*for(int i = 0; i<10;i++){
            nomes[i] = teclado.next();
            idades[i] = teclado.nextInt();
        }*/
        for(int i = 0; i<10;i++){
            for(int j = i+1; j< 10;j++){
                if(nomes[i].compareToIgnoreCase(nomes[j]) > 0){
                    int temp1 = idades[j]; String temp2 = nomes[j];
                    idades[j] = idades[i];
                    idades[i] = temp1;
                    nomes[j] = nomes[i];
                    nomes[i] = temp2;
                }
            }
        }
        System.out.println("Sort por nome: ");
        for(int i = 0; i<10; i++){
            System.out.println(nomes[i] + ", " + idades[i]);
        }
        System.out.println("");
        
        for(int i = 0; i<10;i++){
            for(int j = i+1; j< 10;j++){
                if(idades[i] > idades[j]){
                    int temp1 = idades[j]; String temp2 = nomes[j];
                    idades[j] = idades[i];
                    idades[i] = temp1;
                    nomes[j] = nomes[i];
                    nomes[i] = temp2;
                }
            }
        }
        System.out.println("Sort por idade: ");
        for(int i = 0; i<10; i++){
            System.out.println(nomes[i] + ", " + idades[i]);
        }
        
    }
    
    
    public static void Calculadora(Scanner teclado){
        double memoria = 0;
        
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
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        //Calculadora(teclado);
        ordena();
        
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
