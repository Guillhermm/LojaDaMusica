/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.produtos;

/**
 *
 * @author Zeh Fiorillo
 */
public class Produtos implements java.io.Serializable, Comparable{
    private int codigo;
    private int codforn;
    private String descricao;   
    private double prevenda;
    private int qtdestoq;
    
    public Produtos(int codigo, int codforn, String descricao, double pre_venda, int qtd_est){
        setCodigo(codigo);
        setCodForn(codforn);
        setDescricao(descricao);
        setPreVenda(pre_venda);
        setQtdEstoque(qtd_est);
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    private void setCodForn(int codforn) {
        this.codforn = codforn;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }   
    
    private void setPreVenda(double pre_venda){
        this.prevenda = pre_venda;
    }
    
    private void setQtdEstoque(int qtd_est){
        this.qtdestoq = qtd_est;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public int getCodForn() {
        return this.codforn;
    }

    public String getDescricao() {
        return this.descricao;
    }   
    
    public double getPreVenda(){
        return this.prevenda;
    }
    
    public int getQtdEstoque(){
        return this.qtdestoq;
    }
}
