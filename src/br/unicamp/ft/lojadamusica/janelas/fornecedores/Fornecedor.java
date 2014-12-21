/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.fornecedores;

/**
 *
 * @author Zeh Fiorillo
 */
public class Fornecedor implements java.io.Serializable, Comparable{
    private int codigo;
    private String nome;
    private String rg;
    private int tipdoc;
    private String docum;
    private String endere;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    
    public Fornecedor(int codigo, String nome, String rg, int tipdoc, String docum, String endere, String numero, String bairro, String cep, String cidade, String uf){
        setCodigo(codigo);
        setNome(nome); 
        setRg(rg);
        setTipdoc(tipdoc);
        setDocum(docum);
        setEndere(endere);
        setNumero(numero);
        setBairro(bairro);
        setCep(cep);
        setCidade(cidade);
        setUf(uf);
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setRg(String rg) {
        this.rg = rg;
    }

    private void setTipdoc(int tipdoc) {
        this.tipdoc = tipdoc;       
    }

    private void setDocum(String docum) {
        this.docum = docum;
    }

    private void setEndere(String endere) {
        this.endere = endere;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    private void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private void setCep(String cep) {
        this.cep = cep;
    }

    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private void setUf(String uf) {
        this.uf = uf;
    }
    
    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRg() {
        return this.rg;
    }

    public int getTipdoc() {
        return this.tipdoc;       
    }

    public String getDocum() {
        return this.docum;
    }

    public String getEndere() {
        return this.endere;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCep() {
        return this.cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getUf() {
        return this.uf;
    }
    
}
