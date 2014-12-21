/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.ft.lojadamusica.janelas.compras.cabecalho;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import br.unicamp.ft.lojadamusica.janelas.compras.itens.InclusaoDeItemNaCompra;
import br.unicamp.ft.lojadamusica.janelas.produtos.ProcDadosPro;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author José Henrique
 */
public class PesqCompras extends javax.swing.JFrame {
    private Arquivo vArquivo;
    /**
     * Creates new form Vendas
     */
    public PesqCompras() throws IOException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        vArquivo = new Arquivo("compras.txt");
        vArquivo.carregarArquivo();
        ProcDadosComp vProcDados = new ProcDadosComp();
        vProcDados.getLista(T_Compras, vArquivo, 0, 0);
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
        T_Compras = new javax.swing.JTable();
        SP_Itens = new javax.swing.JScrollPane();
        T_Itens = new javax.swing.JTable();
        MB_Vendas = new javax.swing.JMenuBar();
        M_IncVenda = new javax.swing.JMenu();
        M_AltVendas = new javax.swing.JMenu();
        M_ExcVendas = new javax.swing.JMenu();
        M_MostItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loja da Musica - Compras");

        T_Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compra", "Fornecedor", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SP_Vendas.setViewportView(T_Compras);

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
        InclusaoDeCompras varinccompras = null;
        try {
            varinccompras = new InclusaoDeCompras();
        } catch (IOException ex) {
            Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        varinccompras.carregaInfo(vArquivo, "I", T_Compras, 0);
        SP_Itens.setVisible(false);
        revalidate();
        varinccompras.show();
    }//GEN-LAST:event_M_IncVendaMouseClicked

    private void M_AltVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_AltVendasMouseClicked
        InclusaoDeCompras varaltcompras = null;
        try {
            varaltcompras = new InclusaoDeCompras();
        } catch (IOException ex) {
            Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        int index = T_Compras.getSelectedRow();
        if(index >= 0){
            varaltcompras.carregaInfo(vArquivo, "A", T_Compras, index);    
            SP_Itens.setVisible(false);
            revalidate();
            varaltcompras.show();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione uma Compra!");
            return;
        }
    }//GEN-LAST:event_M_AltVendasMouseClicked

    private void M_ExcVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_ExcVendasMouseClicked
        try {
            int index = T_Compras.getSelectedRow();
            ProcDadosComp vFuncGer = new ProcDadosComp();
            SP_Itens.setVisible(false);
            revalidate();
            if(index >= 0){
                if(JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a compra?") == 0){                      
                    if(vFuncGer.excluirItemCompra(Integer.valueOf(T_Compras.getValueAt(index, 0).toString()))==0){
                        vFuncGer.excluirCompra(index, T_Compras, vArquivo);
                        JOptionPane.showMessageDialog(null, "Compra Excluída com Sucesso!");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma Compra!");
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_M_ExcVendasMouseClicked

    private void M_MostItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_MostItemMouseClicked
        if(SP_Itens.isVisible()){
            SP_Itens.setVisible(false);
        }
        else{          
            int index = T_Compras.getSelectedRow();
            if(index >= 0){
                Arquivo vArqItem = new Arquivo("itemcompra.txt");                  
                try {                
                    vArqItem.carregarArquivo();
                } catch (IOException ex) {
                    Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
                }
                ProcDadosComp vProcDados = new ProcDadosComp();
                int codcomp = Integer.valueOf(T_Compras.getValueAt(index, 0).toString());
                vProcDados.getLista(T_Itens, vArqItem, 1, codcomp);
                SP_Itens.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma Compra!");
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
            java.util.logging.Logger.getLogger(PesqCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PesqCompras().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PesqCompras.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTable T_Compras;
    private javax.swing.JTable T_Itens;
    // End of variables declaration//GEN-END:variables
}