/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.fornecedores;

import br.unicamp.ft.lojadamusica.armazenamento.Arquivo;
import br.unicamp.ft.lojadamusica.janelas.fornecedores.ProcDadosForn;
import br.unicamp.ft.lojadamusica.janelas.produtos.ProcDadosPro;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeh Fiorillo
 */
public class PesqFornecedor extends javax.swing.JFrame {
    private Arquivo vArquivo;
    /**
     * Creates new form Fornecedores
     */
    public PesqFornecedor() throws IOException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        vArquivo = new Arquivo("fornecedor.txt");
        vArquivo.carregarArquivo();
        ProcDadosForn vProcDados = new ProcDadosForn();
        vProcDados.getLista(T_Fornecedores, vArquivo, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SP_Clientes = new javax.swing.JScrollPane();
        T_Fornecedores = new javax.swing.JTable();
        MB_MenuFornecedores = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        T_Fornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Guilhermo Zeni", "232.532.789-32", "123.456.789-01", "Rua do Divórcio", "2", "Pq. Gravidez", "13.456-78", "Caraguatatuba", "SP"},
                {"2", "Edgar ", "111.111.111-11", "222.222.222-22", "Rua Romário", "455", "Cecap", "14.789-56", "Limeira", "SP"}
            },
            new String [] {
                "Código", "Nome", "RG", "CPF/CNPJ", "Endereço", "Número", "Bairro", "CEP", "Cidade", "UF"
            }
        ));
        SP_Clientes.setViewportView(T_Fornecedores);

        jMenu5.setText("Incluir");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        MB_MenuFornecedores.add(jMenu5);

        jMenu6.setText("Alterar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        MB_MenuFornecedores.add(jMenu6);

        jMenu1.setText("Excluir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        MB_MenuFornecedores.add(jMenu1);

        setJMenuBar(MB_MenuFornecedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SP_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SP_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        InclusaoDeFornecedor varincforn = new InclusaoDeFornecedor();
        varincforn.carregaInfo(vArquivo, "I", T_Fornecedores, 0);
        varincforn.show();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        InclusaoDeFornecedor varaltforn = new InclusaoDeFornecedor();
        int index = T_Fornecedores.getSelectedRow();
        if(index >= 0){
            varaltforn.carregaInfo(vArquivo, "A", T_Fornecedores, index);
            varaltforn.show();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um Fornecedor!");
            return;
        }
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        try {
            int index = T_Fornecedores.getSelectedRow();
            ProcDadosForn vFuncGer = new ProcDadosForn();
            if(index >= 0){
                if(JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o fornecedor?") == 0){                
                    ProcDadosPro vProcDados = new  ProcDadosPro();
                    int codigo = Integer.valueOf(T_Fornecedores.getValueAt(index, 0).toString());
                    if(!vProcDados.verificaExc(codigo)){
                        JOptionPane.showMessageDialog(null, "Existem Vendas com esse Cliente!");
                        return;
                    }
                    vFuncGer.excluirForn(index, T_Fornecedores, vArquivo);
                    JOptionPane.showMessageDialog(null, "Fornecedor Excluído com Sucesso!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um Fornecedor!");
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(PesqFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PesqFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(PesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PesqFornecedor().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PesqFornecedor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PesqFornecedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MB_MenuFornecedores;
    private javax.swing.JScrollPane SP_Clientes;
    private javax.swing.JTable T_Fornecedores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    // End of variables declaration//GEN-END:variables
}
