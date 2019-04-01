/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;
import java.lang.Math;

/**
 *
 * @author MVale
 */

public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //strData("anario");
        //sigla("ana cristina da silva dos anjos das oliveiras");
        genes("ACTGCTTATG", "CAGGCAAACC");
    }
    
    public static void strData(String s){
        System.out.println("Tam : " + s.length() + "\n");
        System.out.println(s.toUpperCase() + "\n");
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if ((s.toLowerCase().charAt(i)) == 'a' || (s.toLowerCase().charAt(i)) == 'e' || 
                    (s.toLowerCase().charAt(i)) == 'i' || (s.toLowerCase().charAt(i)) == 'o' || (s.toLowerCase().charAt(i)) == 'u') count++;
        }
        System.out.println("Vogais: " + count + "\n");
        if(s.toLowerCase().indexOf("uni") == 0) 
            System.out.println("Começa com uni\n");
        if(s.toLowerCase().indexOf("rio") == s.length() - 3) 
            System.out.println("Termina com rio\n");
        count = 0;
        for(int i = 0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i))) count++;
        }
        System.out.println("Dígitos: " + count + "\n");
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        
        if(s.equals(reverse)) System.out.println("Palíndromo! \n");
        
    }
    
    public static void sigla(String s){
        String[] tokens = s.split("[ ]+");
        String answer = "";
        for(int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("e") && !tokens[i].equals("da") && 
                    !tokens[i].equals("do") && !tokens[i].equals("dos") && 
                    !tokens[i].equals("de") && !tokens[i].equals("di") &&
                    !tokens[i].equals("du") && !tokens[i].equals("das")) answer = answer + tokens[i].toUpperCase().charAt(0);
        }
        System.out.println(answer);
    }
    public static resposta recombinacao(String s1, String s2){
        String s3 = "", s4 = "";
        int n = (int) (Math.random() * 10);
        if(n==10) n--;
        s3 += s1.substring(0, n);
        s3 += s2.substring(n);
        s4 += s2.substring(0, n);
        s4 += s1.substring(n);
        resposta r = new resposta(s3, s4);
        return r;
    }            
    
    public static char newGene(char c){
        int index = (int) (Math.random() * 10) % 3; 
        switch(c){
            case 'A':
                return "TCG".charAt(index);
            case 'T':
                return "ACG".charAt(index);
            case 'C':
                return "ATG".charAt(index);
            case 'G':
                return "ATC".charAt(index);
            
        }
        return 'd';
    }
    
    public static void mutacao(String s){
        int n = (int) (Math.random() * 10) % 10;
        char c = newGene(s.charAt(n));
        String novo = s.substring(0, n) + c + s.substring(n+1);
        System.out.print(novo + "\n");
    }
            
    public static void genes(String s1, String s2){
        resposta r = recombinacao(s1, s2);
        System.out.println("Pai: " + s1 + "\nMãe: " + s2);
        System.out.println("Filho 1: " + r.get(0) + "\nFilho 2: " + r.get(1));
        int qual = (int) Math.round(Math.random());
        System.out.print("Filho " + (qual + 1) + " sofreu mutação: " );
        mutacao(r.get(qual));
    }
    
}
