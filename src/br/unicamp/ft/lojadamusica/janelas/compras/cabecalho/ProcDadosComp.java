/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.compras.cabecalho;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import br.unicamp.ft.lojadamusica.janelas.produtos.ProcDadosPro;
import br.unicamp.ft.lojadamusica.janelas.compras.cabecalho.Compras;
import br.unicamp.ft.lojadamusica.janelas.compras.itens.InclusaoDeItemNaCompra;
import br.unicamp.ft.lojadamusica.janelas.compras.itens.ItemCompra;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeh Fiorillo
 */
public class ProcDadosComp {
    public void excluirCompra(int Index, JTable grid, Arquivo vArquivo) throws IOException{        
        vArquivo.lista.remove(Index);
        vArquivo.gravarLista();
        getLista(grid, vArquivo, 0, 0);
    }
    
    public int excluirItemCompra(int codCompra) throws IOException, ClassNotFoundException{
        Arquivo vArqItem = new Arquivo("itemcompra.txt");
        vArqItem.carregarArquivo();               
        ArrayList<ItemCompra> exclui = new ArrayList();
        for(int i=0;i<vArqItem.lista.size();i++){
            ProcDadosPro vProcDados = new ProcDadosPro();
            ItemCompra vItemCompra = (ItemCompra) vArqItem.lista.get(i);
            int qtdest = 0;
            try {
                qtdest = vProcDados.buscaEstoque(String.valueOf(vItemCompra.getCodPro()));
            } catch (IOException ex) {
                Logger.getLogger(InclusaoDeItemNaCompra.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InclusaoDeItemNaCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(Integer.valueOf(vItemCompra.getQtd()) > qtdest){
                JOptionPane.showMessageDialog(null, "Quantidade maior do que em Estoque!");
                return 1;
            }                        
            int codven = vItemCompra.getCodCompra();
            if(codCompra == codven)
                exclui.add(vItemCompra);
        }
        for(int i=0;i<exclui.size();i++){
            ItemCompra vItemCompra = (ItemCompra) exclui.get(i);
            ProcDadosPro vProcDadosPro = new ProcDadosPro();          
            vProcDadosPro.subEstoque(vItemCompra.getCodPro(), vItemCompra.getQtd());
            vArqItem.lista.remove(vItemCompra);        
        }
        vArqItem.gravarLista();
        return 0;
    }
    
    public void getLista(JTable grid, Arquivo vArquivo, int tipo, int codcomp){
        DefaultTableModel modelo = (DefaultTableModel)grid.getModel(); 
        int i, n = vArquivo.lista.size();                
        while(modelo.getRowCount()>0)
            modelo.removeRow(0);
        for (i=0; i<n; i++) { 
            if(tipo==0){
                Compras vCompras = (Compras) vArquivo.lista.get(i);
                modelo.addRow(new Object [] {vCompras.getCodigo(),
                                             vCompras.getCodForn(),
                                             vCompras.getValTot()});
            }
            else{
                ItemCompra vItemComp = (ItemCompra) vArquivo.lista.get(i);
                if(codcomp==vItemComp.getCodCompra())
                    modelo.addRow(new Object [] {vItemComp.getCodigo(),
                                                 vItemComp.getCodPro(),
                                                 vItemComp.getQtd(),
                                                 vItemComp.getValUni()});
            }
        }         
    }

    public boolean verificaExc(int tipo, int codigo) throws IOException, ClassNotFoundException {
        Arquivo vArquivo;
        if(tipo==0)
            vArquivo = new Arquivo("itemcompra.txt");
        else
            vArquivo = new Arquivo("compras.txt");
        vArquivo.carregarArquivo();
        for(int i=0;i<vArquivo.lista.size();i++){           
            if(tipo==0){
                ItemCompra vItemComp = (ItemCompra) vArquivo.lista.get(i);
                if(codigo==vItemComp.getCodPro())
                    return false;
            }
            else{
                Compras vCompras = (Compras) vArquivo.lista.get(i);
                if(codigo==vCompras.getCodForn())
                    return false;
            }
        }
        return true;
    }
}
