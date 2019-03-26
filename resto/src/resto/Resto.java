/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author MVale
 */
public class Resto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //int quant;
        Scanner reader = new Scanner(System.in);
        int[] pontos = new int[6];
        //pontos[0] = reader.nextInt(); 
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();    

        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            pontos[i] = Integer.parseInt(strs[i]);
        }
        /*while(reader.hasNext()){
            pontos[i] = reader.nextInt();
            i++;
            if(i==6) break;
        }*/
        if(!triangulo(pontos)) System.out.print("Não forma triângulo! \n");
        else{
            System.out.print("Forma triângulo ");
            if(modulo(pontos[0] - pontos[2], pontos[1] - pontos[3]) != 
               modulo(pontos[0] - pontos[4], pontos[1] - pontos[5]) & 
               modulo(pontos[2] - pontos[0], pontos[3] - pontos[1]) != 
               modulo(pontos[2] - pontos[4], pontos[3] - pontos[5]) & 
               modulo(pontos[4] - pontos[2], pontos[5] - pontos[3]) != 
               modulo(pontos[4] - pontos[0], pontos[5] - pontos[1])){
                
                System.out.print("escaleno!\n");
            }
            else if (modulo(pontos[0] - pontos[2], pontos[1] - pontos[3]) == 
               modulo(pontos[0] - pontos[4], pontos[1] - pontos[5]) & 
               modulo(pontos[2] - pontos[0], pontos[3] - pontos[1]) == 
               modulo(pontos[2] - pontos[4], pontos[3] - pontos[5]) & 
               modulo(pontos[4] - pontos[2], pontos[5] - pontos[3]) == 
               modulo(pontos[4] - pontos[0], pontos[5] - pontos[1])){
                System.out.print("equilátero!\n");
            }
            else System.out.print("isósceles!\n");
        }
        
        //System.out.print("Entre um valor: ");
        //quant = reader.nextInt();
        //resto(quant, reader);
        
        // TODO code application logic here
    }
    public static void resto(int quant, Scanner teclado){
        int cem = quant / 100;
        System.out.print(cem + " notas de 100 \n");
        quant = quant % 100;
        int cinq = quant / 50;
        System.out.print(cinq + " notas de 50 \n");
        quant = quant % 50;
        int vinte = quant / 20;
        System.out.print(vinte + " notas de 20 \n");
        quant = quant % 20;
        int dez = quant / 10;
        System.out.print(dez + " notas de 10 \n");
        quant = quant % 10;
        int cinco = quant / 5;
        System.out.print(cinco + " notas de 5 \n");
        quant = quant % 5;
        int dois = quant / 2;
        System.out.print(dois + " notas de 2 \n");
    }
    
    public static double modulo(int x, int y){
        return Math.sqrt(x*x + y*y);
    }
    public static boolean triangulo(int[] pontos){
        double[] vetorAB = new double[2], vetorBC = new double[2];
        vetorAB[0] = pontos[0] - pontos[2];
        vetorAB[1] = pontos[1] - pontos[3];
        vetorBC[0] = pontos[2] - pontos[4];
        vetorBC[1] = pontos[3] - pontos[5];
        if((vetorAB[0] == 0 & vetorAB[1] == 0) || (vetorBC[0] == 0 & vetorBC[1] == 0)) return false;
        if(vetorAB[0] == 0) return((vetorBC[1]/vetorAB[1]) != 0);
        if(vetorAB[1] == 0) return((vetorBC[0]/vetorAB[0]) != 0);
        if(vetorBC[0] == 0) return((vetorAB[1]/vetorBC[1]) != 0);
        if(vetorBC[1] == 0) return((vetorAB[0]/vetorBC[0]) != 0);
        if(vetorAB[0]>vetorBC[0]) return ((vetorAB[0]/vetorBC[0])!=(vetorAB[1]/vetorBC[1]));
        return ((vetorBC[0]/vetorAB[0])!=(vetorBC[1]/vetorAB[1]));
    }
}
