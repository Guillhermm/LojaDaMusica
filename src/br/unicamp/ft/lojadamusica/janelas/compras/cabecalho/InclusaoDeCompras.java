/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.compras.cabecalho;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import br.unicamp.ft.lojadamusica.janelas.fornecedores.EscolhaDeFornecedor;
import br.unicamp.ft.lojadamusica.janelas.fornecedores.ProcDadosForn;
import br.unicamp.ft.lojadamusica.janelas.produtos.ProcDadosPro;
import br.unicamp.ft.lojadamusica.janelas.compras.cabecalho.Compras;
import br.unicamp.ft.lojadamusica.janelas.compras.itens.InclusaoDeItemNaCompra;
import br.unicamp.ft.lojadamusica.janelas.compras.itens.ItemCompra;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeh Fiorillo
 */
public class InclusaoDeCompras extends javax.swing.JFrame {
    private Arquivo vArquivo;
    private Arquivo vArqItem;
    private String tipo;
    private JTable grid;
    private int index;
    /**
     * Creates new form IncCompras
     */
    public InclusaoDeCompras() throws IOException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        vArqItem = new Arquivo("itemcompra.txt");
        vArqItem.carregarArquivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        L_Compra = new javax.swing.JLabel();
        TF_Compra = new javax.swing.JTextField();
        L_Fornecedor = new javax.swing.JLabel();
        TF_Fornecedor = new javax.swing.JTextField();
        L_Total = new javax.swing.JLabel();
        TF_Total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Itens = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        M_IncItem = new javax.swing.JMenu();
        M_AltItem = new javax.swing.JMenu();
        M_ExcItem = new javax.swing.JMenu();
        M_Gravar = new javax.swing.JMenu();
        M_Cancelar = new javax.swing.JMenu();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loja da Musica - Incluir Compra");

        L_Compra.setText("Compra:");

        TF_Compra.setEditable(false);

        L_Fornecedor.setText("Fornecedor:");

        TF_Fornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_FornecedorFocusLost(evt);
            }
        });

        L_Total.setText("Total:");

        TF_Total.setEditable(false);
        TF_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_TotalActionPerformed(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        T_Itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Valor Unitário"
            }
        ));
        T_Itens.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(T_Itens);

        M_IncItem.setText("Incluir");
        M_IncItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_IncItemMouseClicked(evt);
            }
        });
        jMenuBar1.add(M_IncItem);

        M_AltItem.setText("Alterar");
        M_AltItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_AltItemMouseClicked(evt);
            }
        });
        jMenuBar1.add(M_AltItem);

        M_ExcItem.setText("Excluir");
        M_ExcItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_ExcItemMouseClicked(evt);
            }
        });
        jMenuBar1.add(M_ExcItem);

        M_Gravar.setText("Gravar");
        M_Gravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_GravarMouseClicked(evt);
            }
        });
        jMenuBar1.add(M_Gravar);

        M_Cancelar.setText("Cancelar");
        M_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_CancelarMouseClicked(evt);
            }
        });
        jMenuBar1.add(M_Cancelar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Fornecedor)
                    .addComponent(L_Compra)
                    .addComponent(L_Total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_Total, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(TF_Fornecedor)
                    .addComponent(TF_Compra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Compra)
                    .addComponent(TF_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Fornecedor)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Total)
                    .addComponent(TF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_TotalActionPerformed

    private void M_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_CancelarMouseClicked
        dispose();
    }//GEN-LAST:event_M_CancelarMouseClicked

    private void M_IncItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_IncItemMouseClicked
        InclusaoDeItemNaCompra varincitemcompra = new InclusaoDeItemNaCompra();
        varincitemcompra.carregaInfo("I", T_Itens, TF_Total, Integer.valueOf(TF_Compra.getText()), 0);
        varincitemcompra.show();
    }//GEN-LAST:event_M_IncItemMouseClicked

    private void M_ExcItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_ExcItemMouseClicked
        int index = T_Itens.getSelectedRow();
        if(index >= 0){
            if(JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o item da compra?") == 0){                
                double item = Double.valueOf(T_Itens.getValueAt(index, 2).toString()) * Double.valueOf(T_Itens.getValueAt(index, 3).toString());
                double total = Double.valueOf(TF_Total.getText()) - item;
                TF_Total.setText(String.valueOf(total));
                DefaultTableModel modelo = (DefaultTableModel)T_Itens.getModel();
                modelo.removeRow(index);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Item!");
            return;
        }
    }//GEN-LAST:event_M_ExcItemMouseClicked

    private void M_AltItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_AltItemMouseClicked
        InclusaoDeItemNaCompra varincitemcompra = new InclusaoDeItemNaCompra();
        varincitemcompra.carregaInfo("A", T_Itens, TF_Total, Integer.valueOf(TF_Compra.getText()), T_Itens.getSelectedRow());
        varincitemcompra.show();
    }//GEN-LAST:event_M_AltItemMouseClicked

    private void M_GravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_GravarMouseClicked
        int tipdoc;
        if(TF_Fornecedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Fornecedor é Obrigatório!");
            return;
        }                             
        Compras vCompras = new Compras(Integer.valueOf(Integer.valueOf(TF_Compra.getText())), 
                                       Integer.valueOf(TF_Fornecedor.getText()), 
                                       Double.valueOf(TF_Total.getText()));        
        
        String texto;
        if(tipo=="I"){
            vArquivo.salvaLista(tipo, 0, vCompras);
            texto = "Cadastrada";
        }
        else{
            vArquivo.salvaLista(tipo, index, vCompras);
            texto = "Alterada";
        }        
        try {
            vArquivo.gravarLista();
        } catch (IOException ex) {
            Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i, n = T_Itens.getRowCount();
        for (i=0; i<n; i++) {
            if(tipo=="I"){                
                ProcDadosPro vProcDadosPro = new ProcDadosPro();
                try {
                    vProcDadosPro.subEstoque(Integer.valueOf(T_Itens.getValueAt(i, 1).toString()), 
                                             (Integer.valueOf(T_Itens.getValueAt(i, 2).toString())*-1));
                } catch (IOException ex) {
                    Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            ItemCompra vIteCompras = new ItemCompra(Integer.valueOf(T_Itens.getValueAt(i, 0).toString()),
                                                    Integer.valueOf(TF_Compra.getText()), 
                                                    Integer.valueOf(T_Itens.getValueAt(i, 1).toString()),
                                                    Integer.valueOf(T_Itens.getValueAt(i, 2).toString()),
                                                    Double.valueOf(T_Itens.getValueAt(i, 3).toString()));
            if(tipo=="I")
                vArqItem.salvaLista(tipo, 0, vIteCompras);
            else{
                int qtd_old = vArqItem.salvaAltListaItem(Integer.valueOf(TF_Compra.getText()), 
                                                         Integer.valueOf(T_Itens.getValueAt(i, 0).toString()), 
                                                         vIteCompras, 
                                                         1);
                ProcDadosPro vProcDadosPro = new ProcDadosPro();
                try {
                    vProcDadosPro.subEstoque(Integer.valueOf(T_Itens.getValueAt(i, 1).toString()), 
                                             ((Integer.valueOf(T_Itens.getValueAt(i, 2).toString()) - qtd_old)*-1));
                } catch (IOException ex) {
                    Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            vArqItem.gravarLista();
        } catch (IOException ex) {
            Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProcDadosComp vProcDados = new ProcDadosComp();
        vProcDados.getLista(grid, vArquivo, 0, 0);
            
        JOptionPane.showMessageDialog(null, "Compra " + texto + " com Sucesso!");
        dispose();        
    }//GEN-LAST:event_M_GravarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EscolhaDeFornecedor varescforn = null;
        try {
            varescforn = new EscolhaDeFornecedor();
            varescforn.carregaInfo(TF_Fornecedor);
        } catch (IOException ex) {
            Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        varescforn.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TF_FornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_FornecedorFocusLost
        if(!TF_Fornecedor.getText().isEmpty()){
            ProcDadosForn vProcDados = new ProcDadosForn();
            try {
                if(!vProcDados.existeFornecedor(TF_Fornecedor.getText())){
                    JOptionPane.showMessageDialog(null, "Fornecedor Inválido!");
                    TF_Fornecedor.grabFocus();
                    return;
                }
            } catch (IOException ex) {
                Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }            
    }//GEN-LAST:event_TF_FornecedorFocusLost

    public void carregaInfo(Arquivo vArquivo, String tipo, JTable grid, int index){
        this.vArquivo = vArquivo;
        this.tipo = tipo;
        this.grid = grid;
        this.index = index;
        if(tipo == "I"){
            int codigo;
            if(this.vArquivo.lista.size()>0)
                codigo = Integer.valueOf(grid.getValueAt(this.vArquivo.lista.size()-1, 0).toString())+1;
            else
                codigo = 1;
            TF_Compra.setText(String.valueOf(codigo));
            TF_Total.setText("0");
        }
        else
            Alterar();
    }
    
    public void Alterar(){
        int index = this.grid.getSelectedRow();                
        TF_Compra.setText(this.grid.getValueAt(index, 0).toString());
        TF_Fornecedor.setText(this.grid.getValueAt(index, 1).toString());
        TF_Total.setText(this.grid.getValueAt(index, 2).toString());
        ProcDadosComp vProcDados = new ProcDadosComp();
        vProcDados.getLista(T_Itens, vArqItem, 1, Integer.valueOf(TF_Compra.getText()));
    }
    
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
            java.util.logging.Logger.getLogger(InclusaoDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InclusaoDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InclusaoDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InclusaoDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InclusaoDeCompras().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(InclusaoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Compra;
    private javax.swing.JLabel L_Fornecedor;
    private javax.swing.JLabel L_Total;
    private javax.swing.JMenu M_AltItem;
    private javax.swing.JMenu M_Cancelar;
    private javax.swing.JMenu M_ExcItem;
    private javax.swing.JMenu M_Gravar;
    private javax.swing.JMenu M_IncItem;
    private javax.swing.JTextField TF_Compra;
    private javax.swing.JTextField TF_Fornecedor;
    private javax.swing.JTextField TF_Total;
    private javax.swing.JTable T_Itens;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}