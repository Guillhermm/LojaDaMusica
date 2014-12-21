/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.produtos;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeh Fiorillo
 */
public class ProcDadosPro {
    public void excluirProduto(int Index, JTable grid, Arquivo vArquivo) throws IOException{        
        vArquivo.lista.remove(Index);
        vArquivo.gravarLista();
        getLista(grid, vArquivo, 0);
    }
    
    public void getLista(JTable grid, Arquivo vArquivo, int tipo){
        DefaultTableModel modelo = (DefaultTableModel)grid.getModel(); 
        int i, n = vArquivo.lista.size();                
        while(modelo.getRowCount()>0)
            modelo.removeRow(0);
        for (i=0; i<n; i++) { 
            Produtos vProdutos = (Produtos) vArquivo.lista.get(i);   
            if(tipo==0)
                modelo.addRow(new Object [] {vProdutos.getCodigo(),
                                             vProdutos.getCodForn(),
                                             vProdutos.getDescricao(),
                                             vProdutos.getPreVenda(),
                                             vProdutos.getQtdEstoque()});
            else
                modelo.addRow(new Object [] {vProdutos.getCodigo(),                                         
                                             vProdutos.getDescricao(),
                                             vProdutos.getPreVenda(),
                                             vProdutos.getQtdEstoque()});
        }         
    }
    
    public double existeProduto(String text) throws IOException, ClassNotFoundException {
        Arquivo vArquivo = new Arquivo("produtos.txt");
        vArquivo.carregarArquivo();        
        for(int i=0;i<vArquivo.lista.size();i++){
            Produtos vProduto = (Produtos) vArquivo.lista.get(i);
            if(text.equals(String.valueOf(vProduto.getCodigo()))){                
                return vProduto.getPreVenda();
            }
        }
        return -1;
    }
    
    public int buscaEstoque(String text) throws IOException, ClassNotFoundException {
        Arquivo vArquivo = new Arquivo("produtos.txt");
        vArquivo.carregarArquivo();        
        for(int i=0;i<vArquivo.lista.size();i++){
            Produtos vProduto = (Produtos) vArquivo.lista.get(i);
            if(text.equals(String.valueOf(vProduto.getCodigo()))){                
                return vProduto.getQtdEstoque();
            }
        }
        return -1;
    }
    
    public boolean verificaExc(int codigo) throws IOException, ClassNotFoundException {
        Arquivo vArquivo = new Arquivo("produtos.txt");
        vArquivo.carregarArquivo();
        for(int i=0;i<vArquivo.lista.size();i++){                       
            Produtos vProdutos = (Produtos) vArquivo.lista.get(i);
            if(codigo==vProdutos.getCodForn())
                return false;
        }
        return true;
    }
    
    public void subEstoque(int codpro, int qtd) throws IOException, ClassNotFoundException{
        Arquivo vArquivo = new Arquivo("produtos.txt");
        vArquivo.carregarArquivo();
        for(int i=0;i<vArquivo.lista.size();i++){
            Produtos vProdutos = (Produtos) vArquivo.lista.get(i);
            Produtos vNewProd = new Produtos(vProdutos.getCodigo(),
                                             vProdutos.getCodForn(),
                                             vProdutos.getDescricao(),
                                             vProdutos.getPreVenda(),
                                             vProdutos.getQtdEstoque() - qtd);
            if(codpro == vProdutos.getCodigo()){
                vArquivo.salvaLista("A", i, vNewProd);
                vArquivo.gravarLista();
            }
        }
    }
}
