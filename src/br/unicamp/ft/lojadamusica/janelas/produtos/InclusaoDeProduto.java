/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.ft.lojadamusica.janelas.produtos;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import br.unicamp.ft.lojadamusica.janelas.fornecedores.EscolhaDeFornecedor;
import br.unicamp.ft.lojadamusica.janelas.fornecedores.ProcDadosForn;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guillhermm
 */
public class InclusaoDeProduto extends javax.swing.JFrame {
    private Arquivo vArquivo;
    private String tipo;
    private JTable grid;
    private int index;

    public InclusaoDeProduto() {
        initComponents();
        this.setLocationRelativeTo(null);        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IncProd_Cod = new javax.swing.JTextField();
        IncProd_CodForn = new javax.swing.JTextField();
        IncProd_Desc = new javax.swing.JTextField();
        IncProd_Cancel_Button = new javax.swing.JButton();
        IncProd_Gravar = new javax.swing.JButton();
        IncProd_Limpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        IncProd_PrecoVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IncProd_Qtde = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loja da Música - Incluir Produto");

        jLabel1.setText("Código do Produto:");

        jLabel2.setText("Código do Fornecedor:");

        jLabel3.setText("Descrição:");

        IncProd_Cod.setEditable(false);
        IncProd_Cod.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        IncProd_CodForn.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        IncProd_CodForn.setToolTipText("");
        IncProd_CodForn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IncProd_CodFornFocusLost(evt);
            }
        });

        IncProd_Cancel_Button.setText("Cancelar");
        IncProd_Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncProd_Cancel_ButtonActionPerformed(evt);
            }
        });

        IncProd_Gravar.setText("Gravar");
        IncProd_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncProd_GravarActionPerformed(evt);
            }
        });

        IncProd_Limpar.setText("Limpar");
        IncProd_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncProd_LimparActionPerformed(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço Venda:");

        jLabel5.setText("Qtde:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(IncProd_Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IncProd_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IncProd_Cancel_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jLabel2))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IncProd_CodForn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IncProd_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IncProd_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(IncProd_Qtde, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IncProd_PrecoVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IncProd_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IncProd_CodForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncProd_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IncProd_PrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(IncProd_Qtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncProd_Gravar)
                    .addComponent(IncProd_Cancel_Button)
                    .addComponent(IncProd_Limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IncProd_Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncProd_Cancel_ButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_IncProd_Cancel_ButtonActionPerformed

    private void IncProd_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncProd_LimparActionPerformed
        IncProd_CodForn.setText(null);
        IncProd_Desc.setText(null);
        IncProd_CodForn.grabFocus();
    }//GEN-LAST:event_IncProd_LimparActionPerformed

    private void IncProd_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncProd_GravarActionPerformed
        int tipdoc;
        if(IncProd_Desc.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Descrição é Obrigatório!");
            return;
        }            
        if(IncProd_CodForn.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Código do Fornecedor é Obrigatório!");
            return;
        }        
        if(!validaPreco()){
            JOptionPane.showMessageDialog(null, "Campo Preço Venda Inválido!");
            IncProd_PrecoVenda.grabFocus();
            return;
        }
        if(!validaQtd()){
            JOptionPane.showMessageDialog(null, "Campo Qtde. Inválido!");
            IncProd_Qtde.grabFocus();
            return;
        }
        
        Produtos vProdutos = new Produtos(Integer.valueOf(IncProd_Cod.getText()), 
                                          Integer.valueOf(IncProd_CodForn.getText()),
                                          IncProd_Desc.getText(),
                                          Double.valueOf(IncProd_PrecoVenda.getText()),
                                          Integer.valueOf(IncProd_Qtde.getText()));
        
        String texto;
        if(tipo=="I"){
            vArquivo.salvaLista(tipo, 0, vProdutos);
            texto = "Cadastrado";
        }
        else{
            vArquivo.salvaLista(tipo, index, vProdutos);
            texto = "Alterado";
        }
        try {
            vArquivo.gravarLista();
        } catch (IOException ex) {
            Logger.getLogger(InclusaoDeProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProcDadosPro vProcDadosPro = new ProcDadosPro();
        vProcDadosPro.getLista(grid, vArquivo, 0);
            
        JOptionPane.showMessageDialog(null, "Cliente " + texto + " com Sucesso!");
        dispose();    
    }//GEN-LAST:event_IncProd_GravarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EscolhaDeFornecedor varescforn = null;
        try {
            varescforn = new EscolhaDeFornecedor();
            varescforn.carregaInfo(IncProd_CodForn);
        } catch (IOException ex) {
            Logger.getLogger(InclusaoDeProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InclusaoDeProduto.class.getName()).log(Level.SEVERE, null, ex);
        }        
        varescforn.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IncProd_CodFornFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IncProd_CodFornFocusLost
        if(!IncProd_CodForn.getText().isEmpty()){
            ProcDadosForn vProcDados = new ProcDadosForn();
            try {
                if(!vProcDados.existeFornecedor(IncProd_CodForn.getText())){
                    JOptionPane.showMessageDialog(null, "Fornecedor Inválido!");
                    IncProd_CodForn.grabFocus();
                    return;
                }
            } catch (IOException ex) {
                Logger.getLogger(InclusaoDeProduto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InclusaoDeProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_IncProd_CodFornFocusLost

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
            IncProd_Cod.setText(String.valueOf(codigo));            
        }
        else
            Alterar();
    }
    
    public void Alterar(){
        int index = this.grid.getSelectedRow();                
        IncProd_Cod.setText(this.grid.getValueAt(index, 0).toString());
        IncProd_CodForn.setText(this.grid.getValueAt(index, 1).toString());
        IncProd_Desc.setText(this.grid.getValueAt(index, 2).toString());  
        IncProd_PrecoVenda.setText(this.grid.getValueAt(index, 3).toString());
        IncProd_Qtde.setText(this.grid.getValueAt(index, 4).toString());
    }
    
    private boolean validaPreco() { 
        try{
            double preco = Double.valueOf(IncProd_PrecoVenda.getText());
        } catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
    
    private boolean validaQtd() { 
        try{
            int qtd = Integer.valueOf(IncProd_Qtde.getText());
        } catch (NumberFormatException ex){
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(InclusaoDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InclusaoDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InclusaoDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InclusaoDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IncProd_Cancel_Button;
    private javax.swing.JTextField IncProd_Cod;
    private javax.swing.JTextField IncProd_CodForn;
    private javax.swing.JTextField IncProd_Desc;
    private javax.swing.JButton IncProd_Gravar;
    private javax.swing.JButton IncProd_Limpar;
    private javax.swing.JTextField IncProd_PrecoVenda;
    private javax.swing.JTextField IncProd_Qtde;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
