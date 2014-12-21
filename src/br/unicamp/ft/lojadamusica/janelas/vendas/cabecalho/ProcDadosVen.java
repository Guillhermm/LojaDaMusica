/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.vendas.cabecalho;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import br.unicamp.ft.lojadamusica.janelas.produtos.ProcDadosPro;
import br.unicamp.ft.lojadamusica.janelas.vendas.cabecalho.Vendas;
import br.unicamp.ft.lojadamusica.janelas.vendas.itens.ItemVenda;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeh Fiorillo
 */
public class ProcDadosVen {
    public void excluirVenda(int Index, JTable grid, Arquivo vArquivo) throws IOException{        
        vArquivo.lista.remove(Index);
        vArquivo.gravarLista();
        getLista(grid, vArquivo, 0, 0);
    }
    
    public void excluirItemVenda(int codVenda) throws IOException, ClassNotFoundException{
        Arquivo vArqItem = new Arquivo("itemvenda.txt");
        vArqItem.carregarArquivo();               
        ArrayList<ItemVenda> exclui = new ArrayList();
        for(int i=0;i<vArqItem.lista.size();i++){
            ItemVenda vItemVenda = (ItemVenda) vArqItem.lista.get(i);            
            int codven = vItemVenda.getCodVenda();
            if(codVenda == codven)
                exclui.add(vItemVenda);
        }
        for(int i=0;i<exclui.size();i++){
            ItemVenda vItemVenda = (ItemVenda) exclui.get(i);
            ProcDadosPro vProcDadosPro = new ProcDadosPro();          
            vProcDadosPro.subEstoque(vItemVenda.getCodPro(), (vItemVenda.getQtd()*-1));
            vArqItem.lista.remove(vItemVenda);        
        }
        vArqItem.gravarLista();
    }
    
    public void getLista(JTable grid, Arquivo vArquivo, int tipo, int codven){
        DefaultTableModel modelo = (DefaultTableModel)grid.getModel(); 
        int i, n = vArquivo.lista.size();                
        while(modelo.getRowCount()>0)
            modelo.removeRow(0);
        for (i=0; i<n; i++) { 
            if(tipo==0){
                Vendas vVendas = (Vendas) vArquivo.lista.get(i);
                modelo.addRow(new Object [] {vVendas.getCodigo(),
                                             vVendas.getCodCli(),
                                             vVendas.getValTot()});
            }
            else{
                ItemVenda vItemVen = (ItemVenda) vArquivo.lista.get(i);
                if(codven==vItemVen.getCodVenda())
                    modelo.addRow(new Object [] {vItemVen.getCodigo(),
                                                 vItemVen.getCodPro(),
                                                 vItemVen.getQtd(),
                                                 vItemVen.getValUni()});
            }
        }         
    }

    public boolean verificaExc(int tipo, int codigo) throws IOException, ClassNotFoundException {
        Arquivo vArquivo;
        if(tipo==0)
            vArquivo = new Arquivo("itemvenda.txt");
        else
            vArquivo = new Arquivo("vendas.txt");
        vArquivo.carregarArquivo();
        for(int i=0;i<vArquivo.lista.size();i++){           
            if(tipo==0){
                ItemVenda vItemVen = (ItemVenda) vArquivo.lista.get(i);
                if(codigo==vItemVen.getCodPro())
                    return false;
            }
            else{
                Vendas vVendas = (Vendas) vArquivo.lista.get(i);
                if(codigo==vVendas.getCodCli())
                    return false;
            }
        }
        return true;
    }
}
