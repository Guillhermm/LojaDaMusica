/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.compras.cabecalho;

/**
 *
 * @author Zeh Fiorillo
 */
public class Compras implements java.io.Serializable, Comparable{
    private int codigo;
    private int codforn;
    private double valtot; 
    
    public Compras(int codven, int cod_forn, double valor){
        setCodigo(codven);
        setCodForn(cod_forn);
        setValTot(valor);  
    }
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void setCodigo(int codven) {
        this.codigo = codven;
    }

    private void setCodForn(int cod_forn) {
        this.codforn = cod_forn;
    }

    private void setValTot(double valor) {
        this.valtot = valor;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public int getCodForn() {
        return this.codforn;
    }

    public double getValTot() {
        return this.valtot;
    } 
}
