/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.ft.lojadamusica.janelas.vendas.cabecalho;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author José Henrique
 */
public class PesqVendas extends javax.swing.JFrame {
    private Arquivo vArquivo;
    /**
     * Creates new form Vendas
     */
    public PesqVendas() throws IOException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        vArquivo = new Arquivo("vendas.txt");
        vArquivo.carregarArquivo();
        ProcDadosVen vProcDados = new ProcDadosVen();
        vProcDados.getLista(T_Vendas, vArquivo, 0, 0);
        SP_Itens.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SP_Vendas = new javax.swing.JScrollPane();
        T_Vendas = new javax.swing.JTable();
        SP_Itens = new javax.swing.JScrollPane();
        T_Itens = new javax.swing.JTable();
        MB_Vendas = new javax.swing.JMenuBar();
        M_IncVenda = new javax.swing.JMenu();
        M_AltVendas = new javax.swing.JMenu();
        M_ExcVendas = new javax.swing.JMenu();
        M_MostItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loja da Musica - Vendas");

        T_Vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venda", "Cliente", "Valor Total"
            }
        ));
        SP_Vendas.setViewportView(T_Vendas);

        T_Itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Valor Unitário"
            }
        ));
        SP_Itens.setViewportView(T_Itens);

        M_IncVenda.setText("Incluir");
        M_IncVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_IncVendaMouseClicked(evt);
            }
        });
        MB_Vendas.add(M_IncVenda);

        M_AltVendas.setText("Alterar");
        M_AltVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_AltVendasMouseClicked(evt);
            }
        });
        MB_Vendas.add(M_AltVendas);

        M_ExcVendas.setText("Excluir");
        M_ExcVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_ExcVendasMouseClicked(evt);
            }
        });
        MB_Vendas.add(M_ExcVendas);

        M_MostItem.setText("Mostrar Itens");
        M_MostItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_MostItemMouseClicked(evt);
            }
        });
        MB_Vendas.add(M_MostItem);

        setJMenuBar(MB_Vendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SP_Vendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
            .addComponent(SP_Itens, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SP_Vendas, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(SP_Itens, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M_IncVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_IncVendaMouseClicked
        InclusaoDeVenda varincvendas = null;
        try {
            varincvendas = new InclusaoDeVenda();
        } catch (IOException ex) {
            Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
        varincvendas.carregaInfo(vArquivo, "I", T_Vendas, 0);
        SP_Itens.setVisible(false);
        revalidate();
        varincvendas.show();
    }//GEN-LAST:event_M_IncVendaMouseClicked

    private void M_AltVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_AltVendasMouseClicked
        InclusaoDeVenda varaltvendas = null;
        try {
            varaltvendas = new InclusaoDeVenda();
        } catch (IOException ex) {
            Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
        int index = T_Vendas.getSelectedRow();
        if(index >= 0){
            varaltvendas.carregaInfo(vArquivo, "A", T_Vendas, index);    
            SP_Itens.setVisible(false);
            revalidate();
            varaltvendas.show();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um Cliente!");
            return;
        }
    }//GEN-LAST:event_M_AltVendasMouseClicked

    private void M_ExcVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_ExcVendasMouseClicked
        try {
            int index = T_Vendas.getSelectedRow();
            ProcDadosVen vFuncGer = new ProcDadosVen();
            SP_Itens.setVisible(false);
            revalidate();
            if(index >= 0){
                if(JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a venda?") == 0){  
                    vFuncGer.excluirItemVenda(Integer.valueOf(T_Vendas.getValueAt(index, 0).toString()));
                    vFuncGer.excluirVenda(index, T_Vendas, vArquivo);
                    JOptionPane.showMessageDialog(null, "Venda Excluída com Sucesso!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma Venda!");
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_M_ExcVendasMouseClicked

    private void M_MostItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_MostItemMouseClicked
        if(SP_Itens.isVisible()){
            SP_Itens.setVisible(false);
        }
        else{          
            int index = T_Vendas.getSelectedRow();
            if(index >= 0){
                Arquivo vArqItem = new Arquivo("itemvenda.txt");                  
                try {                
                    vArqItem.carregarArquivo();
                } catch (IOException ex) {
                    Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
                }
                ProcDadosVen vProcDados = new ProcDadosVen();            
                int codven = Integer.valueOf(T_Vendas.getValueAt(index, 0).toString());
                vProcDados.getLista(T_Itens, vArqItem, 1, codven);
                SP_Itens.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma Venda!");
                return;
            }
        }
        revalidate();
    }//GEN-LAST:event_M_MostItemMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesqVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PesqVendas().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PesqVendas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MB_Vendas;
    private javax.swing.JMenu M_AltVendas;
    private javax.swing.JMenu M_ExcVendas;
    private javax.swing.JMenu M_IncVenda;
    private javax.swing.JMenu M_MostItem;
    private javax.swing.JScrollPane SP_Itens;
    private javax.swing.JScrollPane SP_Vendas;
    private javax.swing.JTable T_Itens;
    private javax.swing.JTable T_Vendas;
    // End of variables declaration//GEN-END:variables
}
