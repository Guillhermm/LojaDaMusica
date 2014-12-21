package br.unicamp.ft.lojadamusica.logica;


import br.unicamp.ft.lojadamusica.login.Login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author José Henrique
 */
public class LojaDaMusica {

    private static Login user;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        user = new Login();
        user.show();
     
    }

    public static void iniciarPrograma() {
        user.iniciarExibicao();
    }

    public static void exiberMatriculaInvalida() {
        user.invalidarMatricula();
    }

    public static void exibirSenhaInvalida() {
        user.invalidarSenha();
    }
    
}
