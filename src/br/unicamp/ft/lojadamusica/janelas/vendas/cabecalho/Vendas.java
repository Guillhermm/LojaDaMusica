/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.vendas.cabecalho;

/**
 *
 * @author Zeh Fiorillo
 */
public class Vendas implements java.io.Serializable, Comparable{
    private int codigo;
    private int codcli;
    private double valtot; 
    
    public Vendas(int codven, int cod_cli, double valor){
        setCodigo(codven);
        setCodCli(cod_cli);
        setValTot(valor);  
    }
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void setCodigo(int codven) {
        this.codigo = codven;
    }

    private void setCodCli(int cod_cli) {
        this.codcli = cod_cli;
    }

    private void setValTot(double valor) {
        this.valtot = valor;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public int getCodCli() {
        return this.codcli;
    }

    public double getValTot() {
        return this.valtot;
    } 
}
