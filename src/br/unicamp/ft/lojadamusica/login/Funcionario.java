/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.login;

import br.unicamp.ft.lojadamusica.armazenamento.ArquivoDeLogin;

/**
 *
 * @author Guillhermm
 */
class Funcionario {

    private String indice;
    
    void setarIndiceDeBusca(String indiceDeBusca) {
        indice = indiceDeBusca;
    }

    public String obterSenhaDoFuncionario() {
        String senhaAberta = new ArquivoDeLogin().abrirArquivoDeAcesso("senha.txt");
        int posicaoDoSeparador = senhaAberta.indexOf("|", 0);
        String senha = senhaAberta.substring(posicaoDoSeparador+1);
        return senha;
    }
    
}
