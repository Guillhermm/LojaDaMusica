/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.armazenamento;

import br.unicamp.ft.lojadamusica.janelas.compras.itens.ItemCompra;
import br.unicamp.ft.lojadamusica.janelas.vendas.itens.ItemVenda;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeh Fiorillo
 */
public class Arquivo{    
    private String arquivo;
    public ArrayList<Object> lista;

    public Arquivo(String nomeArq) {
        setNomArq(nomeArq);
    }
    
    public void setNomArq(String nomeArq){
        this.arquivo = nomeArq;
    }           
    
    public void carregarArquivo() throws IOException, ClassNotFoundException{
        File file = new File(arquivo);
        if(!file.exists()){
            file.createNewFile();
            lista = new ArrayList();
        }else if(file.length()>0){
            lista = new ArrayList(recuperaCollection(file));         
        }
        else{
            lista = new ArrayList();
        }
    }      
    
    public Collection recuperaCollection(File file) throws IOException, ClassNotFoundException{
        ObjectInputStream arq = new ObjectInputStream(new FileInputStream(file));
        return (Collection) arq.readObject();
    }
    
    public void salvaLista(String Tipo, int Index, Object vObject){        
        if(Tipo == "I")
            lista.add(vObject);
        else if(Tipo == "A")
            lista.set(Index, vObject);
    }
    
    public int salvaAltListaItem(int codigo, int seq, Object vObject, int compven){        
        int index = 0, qtd_old = 0;        
        for(int i=0;i<lista.size();i++){
            if(compven == 0){
                ItemVenda vIteVen = (ItemVenda) lista.get(i);
                int venda = vIteVen.getCodVenda();
                int codite = vIteVen.getCodigo();
                if((venda==codigo)&&(codite==seq)){
                    index = i;
                    qtd_old = vIteVen.getQtd();
                }
            }else{
                ItemCompra vIteComp = (ItemCompra) lista.get(i);
                int venda = vIteComp.getCodCompra();
                int codite = vIteComp.getCodigo();
                if((venda==codigo)&&(codite==seq)){
                    index = i;
                    qtd_old = vIteComp.getQtd();
                }
            }
        }
        lista.set(index, vObject);
        return qtd_old;
    }
    
    public void gravarLista() throws IOException{        
        File file = new File(arquivo);
        if(!file.exists())
            file.createNewFile();
        ObjectOutputStream arq = new ObjectOutputStream(new FileOutputStream(file));
        arq.writeObject(lista);
    }                                 
}
