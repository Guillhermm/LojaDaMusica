/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.fornecedores;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import br.unicamp.ft.lojadamusica.janelas.clientes.Cliente;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeh Fiorillo
 */
public class ProcDadosForn {
    public void excluirForn(int Index, JTable grid, Arquivo vArquivo) throws IOException{        
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
            Fornecedor vFornecedor = (Fornecedor) vArquivo.lista.get(i); 
            if(tipo==0)
                modelo.addRow(new Object [] {vFornecedor.getCodigo(),
                                             vFornecedor.getNome(),
                                             vFornecedor.getRg(),
                                             vFornecedor.getDocum(),
                                             vFornecedor.getEndere(),
                                             vFornecedor.getNumero(),
                                             vFornecedor.getBairro(),
                                             vFornecedor.getCep(),
                                             vFornecedor.getCidade(),
                                             vFornecedor.getUf()});
            else
                modelo.addRow(new Object [] {vFornecedor.getCodigo(),
                                         vFornecedor.getNome()});
        }         
    }

    public boolean existeFornecedor(String text) throws IOException, ClassNotFoundException {
        Arquivo vArquivo = new Arquivo("fornecedor.txt");
        vArquivo.carregarArquivo();
        for(int i=0;i<vArquivo.lista.size();i++){
            Fornecedor vFornecedor = (Fornecedor) vArquivo.lista.get(i);
            if(text.equals(String.valueOf(vFornecedor.getCodigo())))
                return true;
        }
        return false;
    }
    
    public int retornaCombo(Arquivo vArquivo, int index){
        Fornecedor vFornecedor = (Fornecedor) vArquivo.lista.get(index);
        return vFornecedor.getTipdoc();
    }  
}
