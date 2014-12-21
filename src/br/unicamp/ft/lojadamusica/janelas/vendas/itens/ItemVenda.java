/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.vendas.itens;

/**
 *
 * @author Zeh Fiorillo
 */
public class ItemVenda implements java.io.Serializable, Comparable{
    private int codigo;
    private int codven;
    private int codpro;
    private int qtd;
    private double valuni;
    
    public ItemVenda(int codite, int cod_ven, int cod_pro, int qtde, double valor){
        setCodigo(codite);
        setCodVenda(cod_ven);
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
    
    private void setCodVenda(int cod_ven){
        this.codven = cod_ven;        
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
    
    public int getCodVenda(){
        return this.codven;        
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
