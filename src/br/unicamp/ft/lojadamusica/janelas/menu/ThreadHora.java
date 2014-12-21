/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.janelas.menu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guillhermm
 */
class ThreadHora {

    private DateFormat formatoDaHora;
    private Date variavelTempo;

    ThreadHora(final Menu aThis) {

        new Thread() {
            
            @Override
            public void run() {

                while(true) {
                    formatoDaHora = new SimpleDateFormat("hh:mm:ss");
                    variavelTempo = new Date();
                    aThis.setarHora(formatoDaHora.format(variavelTempo));
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadHora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        }.start();
                
    }

}
