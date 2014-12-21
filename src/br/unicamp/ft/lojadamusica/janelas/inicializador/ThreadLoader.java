/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.inicializador;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import br.unicamp.ft.lojadamusica.janelas.menu.Menu;
/**
 *
 * @author Guillhermm
 */
class ThreadLoader {
            
    private int contprogr;
    Menu varmenu = new Menu();
    
    void Fillbar(final JProgressBar BarraProgresso, final JLabel lblLoader, final br.unicamp.ft.lojadamusica.janelas.inicializador.Carregador fechar) {
        
        new Thread() {
            public void run() {
                for (contprogr = 0; contprogr < 101; contprogr+=2) {

                    try {
                            
                        sleep(100);
                        BarraProgresso.setValue(contprogr);
                        if (BarraProgresso.getValue() <= 25) {
                            lblLoader.setText("Carregando sistema...");
                        } else if (BarraProgresso.getValue() <= 50) {
                            lblLoader.setText("Conectando banco de dados...");
                        } else if (BarraProgresso.getValue() <= 75) {
                            lblLoader.setText("Abrindo tabelas...");
                        } else if (BarraProgresso.getValue() <100) {
                            lblLoader.setText("Preparando menu inicial...");
                        } else {
                            lblLoader.setText("O sistema está pronto!");
                            this.finalize();
                            fechar.dispose();
                            varmenu.show();
                        }
                           
                    } catch (InterruptedException ex) {
                        
                    } catch (Throwable ex) {
                        Logger.getLogger(ThreadLoader.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
            
        }.start();
        
    }
}
