/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.armazenamento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Guillhermm
 */
public class ArquivoDeLogin {
  
    String line = null;
    BufferedReader brprod = null;
    
    public String abrirArquivoDeAcesso(String fileName) {
        
        try {
            
            FileReader frprod = new FileReader(fileName);
            brprod = new BufferedReader(frprod);
            
            line = brprod.readLine();       
           
            return line;
            
        } catch (FileNotFoundException ex) {
            System.out.println("Incapaz de abrir arquivo!");
            return null;
        } catch (IOException ex) {
            System.out.println("Erro ao ler arquivo!");
            return null;
        } finally {
            
            try {
                
                if(brprod != null) {
                        
                    brprod.close();
                    
                } 
                
            } catch (IOException e) {
                
            }
            
        }
                 
    }
  
}