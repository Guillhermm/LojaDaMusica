/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.compras.itens;

/**
 *
 * @author Zeh Fiorillo
 */
public class ItemCompra implements java.io.Serializable, Comparable{
    private int codigo;
    private int codcomp;
    private int codpro;
    private int qtd;
    private double valuni;
    
    public ItemCompra(int codite, int cod_comp, int cod_pro, int qtde, double valor){
        setCodigo(codite);
        setCodCompra(cod_comp);
        setCodPro(cod_pro);
        setQtd(qtde);
        setValUni(valor);
    }
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void setCodigo(int codite){
        this.codigo = codite;        
    }
    
    private void setCodCompra(int cod_comp){
        this.codcomp = cod_comp;
    }
    
    private void setCodPro(int cod_pro){
        this.codpro = cod_pro;
    }
    
    private void setQtd(int qtde){
        this.qtd = qtde;
    }
    
    private void setValUni(double valor){
        this.valuni = valor;
    }
    
    public int getCodigo(){
        return this.codigo;        
    }
    
    public int getCodCompra(){
        return this.codcomp;        
    }
    
    public int getCodPro(){
        return this.codpro;
    }
    
    public int getQtd(){
        return this.qtd;
    }
    
    public double getValUni(){
        return this.valuni;
    }
}
