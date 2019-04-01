/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author MVale
 */
public class resposta {
    String[] resps;
    
    public resposta(String r1, String r2){
        resps = new String[2];
        this.resps[0] = r1;
        this.resps[1] = r2;
    }
    public String get(int i){
        return resps[i];
    }
}
