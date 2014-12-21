/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.clientes;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeh Fiorillo
 */
public class ProcDadosCli {
    
    public void excluirCliente(int Index, JTable grid, Arquivo vArquivo) throws IOException{        
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
            Cliente vCliente = (Cliente) vArquivo.lista.get(i); 
            if(tipo==0)
                modelo.addRow(new Object [] {vCliente.getCodigo(),
                                             vCliente.getNome(),
                                             vCliente.getRg(),
                                             vCliente.getDocum(),
                                             vCliente.getEndere(),
                                             vCliente.getNumero(),
                                             vCliente.getBairro(),
                                             vCliente.getCep(),
                                             vCliente.getCidade(),
                                             vCliente.getUf()});
            else
                modelo.addRow(new Object [] {vCliente.getCodigo(),
                                             vCliente.getNome()});
        }         
    }

    public boolean existeCliente(String text) throws IOException, ClassNotFoundException {
        Arquivo vArquivo = new Arquivo("cliente.txt");
        vArquivo.carregarArquivo();
        for(int i=0;i<vArquivo.lista.size();i++){
            Cliente vCliente = (Cliente) vArquivo.lista.get(i);
            if(text.equals(String.valueOf(vCliente.getCodigo())))
                return true;
        }
        return false;
    }
    
    public int retornaCombo(Arquivo vArquivo, int index){
        Cliente vCliente = (Cliente) vArquivo.lista.get(index);
        return vCliente.getTipdoc();
    }    
}
